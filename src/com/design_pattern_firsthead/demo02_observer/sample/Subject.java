package com.design_pattern_firsthead.demo02_observer.sample;

/**
 * Created by thinkpad on 2018/7/14.
 */
public interface Subject {
     void registerObserver(Observer observer);

     void removeObserver(Observer observer);

     void notifyObservers();
}
