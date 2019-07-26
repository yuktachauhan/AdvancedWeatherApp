package com.example.android.newweather;

import android.arch.lifecycle.LiveData;

import com.example.android.newweather.model.CurrentWeatherModel;

import io.reactivex.Single;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    @GET(".")
    Single<CurrentWeatherModel> getWeather(@Query("q") String query, @Query("appid") String apiKey);
}
