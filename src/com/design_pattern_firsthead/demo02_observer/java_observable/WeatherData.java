package com.design_pattern_firsthead.demo02_observer.java_observable;

import java.util.Observable;

/**
 * Created by thinkpad on 2018/7/14.
 */
public class WeatherData extends Observable{

    private float mTemperature;
    private float mPressure;
    private float mHumidity;


    public WeatherData() {

    }

    public void setData(float mTemperature, float mPressure, float mHumidity) {
        this.mTemperature = mTemperature;
        this.mPressure = mPressure;
        this.mHumidity = mHumidity;
        dataChange();
    }

    public void dataChange() {
        //Observable里一定要写setChanged
        this.setChanged();
        notifyObservers(new Data(getmTemperature(), getmPressure(), getmHumidity()));
    }

    public float getmTemperature() {
        return mTemperature;
    }

    public float getmPressure() {
        return mPressure;
    }

    public float getmHumidity() {
        return mHumidity;
    }


}
