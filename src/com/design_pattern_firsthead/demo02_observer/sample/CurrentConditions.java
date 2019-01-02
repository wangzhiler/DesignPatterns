package com.design_pattern_firsthead.demo02_observer.sample;

/**
 * Created by thinkpad on 2018/7/14.
 */
public class CurrentConditions implements Observer {

    private float mTemperature;
    private float mPressure;
    private float mHumidity;

    @Override
    public String toString() {
        return "CurrentConditions{" +
                "mTemperature=" + mTemperature +
                ", mPressure=" + mPressure +
                ", mHumidity=" + mHumidity +
                '}';
    }

    @Override
    public void update(float mTemperature, float mPressure, float mHumidity) {
        this.mTemperature = mTemperature;
        this.mPressure = mPressure;
        this.mHumidity = mHumidity;
        display();
    }

    public void display() {
        System.out.println("****Today CurrentConditions{" +
                "mTemperature=" + mTemperature +
                ", mPressure=" + mPressure +
                ", mHumidity=" + mHumidity +
                '}');
    }
}
