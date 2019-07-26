package com.example.android.newweather.view;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.android.newweather.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager manager=getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        CurrentWeatherFragment fragment = new CurrentWeatherFragment();
        transaction.add(R.id.fragment_container,fragment);
        transaction.commit();
    }
}
