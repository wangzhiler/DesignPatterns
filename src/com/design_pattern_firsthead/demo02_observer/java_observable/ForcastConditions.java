package com.design_pattern_firsthead.demo02_observer.java_observable;


import java.util.Observable;
import java.util.Observer;

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



    public void display() {
        System.out.println("****Tomorrow ForcastConditions{" +
                "mTemperature=" + mTemperature +
                ", mPressure=" + mPressure +
                ", mHumidity=" + mHumidity +
                '}');
    }

    @Override
    public void update(Observable o, Object arg) {
        this.mTemperature = ((Data) (arg)).mTemperature;
        this.mPressure = ((Data) (arg)).mPressure;
        this.mHumidity = ((Data) (arg)).mHumidity;
        display();
    }
}
