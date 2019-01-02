package com.design_pattern_firsthead.demo02_observer.sample;

/**
 * Created by thinkpad on 2018/7/14.
 */
public class InternetWeather {
    public static void main(String[] args) {
        CurrentConditions mCurrentConditions;
        ForcastConditions mForcastConditions;
        WeatherData mWeatherData;

        mWeatherData = new WeatherData();
        mCurrentConditions = new CurrentConditions();
        mForcastConditions = new ForcastConditions();

        //注册两个观察者
        mWeatherData.registerObserver(mCurrentConditions);
        mWeatherData.registerObserver(mForcastConditions);

        mWeatherData.setData(30, 150, 40);

        mWeatherData.removeObserver(mCurrentConditions);
        mWeatherData.setData(40, 250, 50);

    }
}
