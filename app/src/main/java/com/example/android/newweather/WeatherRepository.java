package com.example.android.newweather;

import android.content.Context;
import android.util.Log;

import com.example.android.newweather.model.CurrentWeatherModel;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;

public class WeatherRepository {

    private static Context context;
    private ApiClient apiClient;
    private ApiService apiService;
    private CurrentWeatherModel currentWeatherModel;
    private static WeatherRepository weatherRepository;

    public WeatherRepository(Context context1){
        this.context=context1;
       apiService =ApiClient.getClient(context).create(ApiService.class);
    }

    public static synchronized  WeatherRepository getInstance(){
        if(weatherRepository==null){
            if(weatherRepository==null){
                weatherRepository = new WeatherRepository(context);
            }
        }
        return weatherRepository;
    }

    public void fetchWeather(String query,String apiKey){
        apiService.getWeather(query,apiKey)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new SingleObserver<CurrentWeatherModel>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        Log.d("Subscription", "onSubscribe: ");
                    }

                    @Override
                    public void onSuccess(CurrentWeatherModel currentWeatherModel1) {
                        Log.d("Success", "onSuccess: ");
                        currentWeatherModel=currentWeatherModel1;
                        Log.d("model", "onSuccess: "+currentWeatherModel.toString());
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.d("Error", "onError: "+e.getMessage());
                    }
                });
    }

    public CurrentWeatherModel getCurrentWeatherModel(String query,String apiKey){
        fetchWeather(query,apiKey);
        return currentWeatherModel;
    }
}

