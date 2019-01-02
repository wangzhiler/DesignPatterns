package com.design_pattern_firsthead.demo02_observer.sample;

/**
 * Created by thinkpad on 2018/7/14.
 */
public class ForcastConditions implements Observer {


    private float mTemperature;
    private float mPressure;
    private float mHumidity;

    @Override
    public String toString() {
        return "ForcastConditions{" +
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
        System.out.println("****Tomorrow ForcastConditions{" +
                "mTemperature=" + mTemperature +
                ", mPressure=" + mPressure +
                ", mHumidity=" + mHumidity +
                '}');
    }
}
