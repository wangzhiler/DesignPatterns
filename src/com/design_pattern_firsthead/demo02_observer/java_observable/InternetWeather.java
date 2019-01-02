package com.design_pattern_firsthead.demo02_observer.java_observable;

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
        //后注册的先执行
        mWeatherData.addObserver(mCurrentConditions);
        mWeatherData.addObserver(mForcastConditions);

        mWeatherData.setData(30, 150, 40);

        mWeatherData.deleteObserver(mCurrentConditions);
        mWeatherData.setData(20, 170, 42);


    }
}
