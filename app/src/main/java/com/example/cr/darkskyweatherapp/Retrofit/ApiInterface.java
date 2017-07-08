package com.example.cr.darkskyweatherapp.Retrofit;

import com.example.cr.darksky.Model.Temperature;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiInterface
{
    @GET("203bf0976335ed98863b556ed9f61f79/{lon},{latt}")
    Call<Temperature> getTemperature(@Path("lon") Double lon, @Path("latt") Double latt);
}
