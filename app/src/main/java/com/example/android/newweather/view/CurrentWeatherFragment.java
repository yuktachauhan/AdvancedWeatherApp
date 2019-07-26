package com.example.android.newweather.view;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.newweather.R;

public class CurrentWeatherFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle savedInstanceState){
         View view= inflater.inflate(R.layout.current_weather_fragment,viewGroup,false);
         return view;
    }
}
