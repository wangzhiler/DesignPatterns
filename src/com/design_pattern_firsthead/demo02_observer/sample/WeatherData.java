package com.design_pattern_firsthead.demo02_observer.sample;

import java.util.ArrayList;

/**
 * Created by thinkpad on 2018/7/14.
 */
public class WeatherData implements Subject {

    private float mTemperature;
    private float mPressure;
    private float mHumidity;

    private ArrayList<Observer> mObservers;

    public WeatherData() {
        mObservers = new ArrayList<>();
    }

    public void setData(float mTemperature, float mPressure, float mHumidity) {
        this.mTemperature = mTemperature;
        this.mPressure = mPressure;
        this.mHumidity = mHumidity;
        dataChange();
    }

    public void dataChange() {
        notifyObservers();
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

    @Override
    public void registerObserver(Observer observer) {
        mObservers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (mObservers.contains(observer)) {
            mObservers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for(int i=0; i<mObservers.size(); i++) {
            mObservers.get(i).update(getmTemperature(), getmPressure(), getmHumidity());
        }
    }
}
