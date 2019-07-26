package com.example.android.newweather.viewmodel;

import android.content.Context;

import com.example.android.newweather.WeatherRepository;
import com.example.android.newweather.model.CurrentWeatherModel;

public class WeatherViewModel {

    private CurrentWeatherModel currentWeatherModel;

    public WeatherViewModel(Context context,String query,String apiKey){
        currentWeatherModel = WeatherRepository.getInstance().getCurrentWeatherModel(query, apiKey);
    }

    public CurrentWeatherModel getCurrentWeatherModel(){
        return currentWeatherModel;
    }
}
