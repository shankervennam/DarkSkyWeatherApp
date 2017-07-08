
package com.example.cr.darkskyweatherapp.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Temperature
{
    @SerializedName("timezone")
    @Expose
    private String timezone;

    @SerializedName("daily")
    @Expose
    private Daily daily;

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public Daily getDaily() {
        return daily;
    }

    public void setDaily(Daily daily) {
        this.daily = daily;
    }

        public class Daily
            {
                @SerializedName("data")
                @Expose
                private List<DataNew> data = null;

                public List<DataNew> getData()
                {
                    return data;
                }

                public void setData(List<DataNew> data)
                {
                    this.data = data;
                }

            }

        public class DataNew
            {
                @SerializedName("time")
                @Expose
                private Integer time;
                @SerializedName("temperatureMin")
                @Expose
                private Double temperatureMin;
                @SerializedName("temperatureMax")
                @Expose
                private Double temperatureMax;

                public Integer getTime() {
                    return time;
                }

                public void setTime(Integer time) {
                    this.time = time;
                }

                public Double getTemperatureMin() {
                    return temperatureMin;
                }

                public void setTemperatureMin(Double temperatureMin) {
                    this.temperatureMin = temperatureMin;
                }

                public Double getTemperatureMax() {
                    return temperatureMax;
                }

                public void setTemperatureMax(Double temperatureMax) {
                    this.temperatureMax = temperatureMax;
                }
            }
}
