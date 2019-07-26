package com.example.android.newweather.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CurrentWeatherModel {
    @SerializedName("coord")
    private HashMap<String,Integer> coordinates;

    @SerializedName("weather")
    private List<HashMap<String,String>> weather = new ArrayList<>();

    @SerializedName("base")
    private String base;

    @SerializedName("main")
    private HashMap<String,Integer> main;

    @SerializedName("visibility")
    private int visibility;

    @SerializedName("wind")
    private HashMap<String,Integer> wind;

    @SerializedName("clouds")
    private HashMap<String,Integer> clouds;

    @SerializedName("dt")
    private int date;

    @SerializedName("sys")
    private HashMap<String,String> sys;

    @SerializedName("name")
    private String name;
}
