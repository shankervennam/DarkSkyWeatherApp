package com.example.cr.darkskyweatherapp.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.cr.darksky.Model.Temperature;
import com.example.cr.darksky.R;

import java.util.List;

public class TemperAdapter extends RecyclerView.Adapter<TemperAdapter.TempViewHolder>
{
    private List<Temperature.DataNew> dataNew;
    private int rowLayout;
    private Context context;

    public TemperAdapter(List<Temperature.DataNew> dataNew, int rowLayout, Context context)
    {
        this.dataNew = dataNew;
        this.rowLayout = rowLayout;
        this.context = context;
    }

    @Override
    public TempViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new TempViewHolder(view);
    }

    @Override
    public void onBindViewHolder(TemperAdapter.TempViewHolder holder, int position)
    {
        holder.temp_min.setText(dataNew.get(position).getTemperatureMin().toString());
        holder.temp_max.setText(dataNew.get(position).getTemperatureMax().toString());
    }

    @Override
    public int getItemCount()
    {
        return dataNew.size();
    }

    public class TempViewHolder extends RecyclerView.ViewHolder
    {
        LinearLayout linearLayout;
        TextView temp_min;
        TextView temp_max;

        public TempViewHolder(View itemView)
        {
            super(itemView);
            linearLayout = (LinearLayout) itemView.findViewById(R.id.temp_layout);
            temp_min= (TextView) itemView.findViewById(R.id.temp_min);
            temp_max = (TextView) itemView.findViewById(R.id.temp_max);
        }
    }
}
