package com.design_pattern_firsthead.demo04_singleton;

/**
 * Created by thinkpad on 2018/7/16.
 */
public class Singleton {
    private static Singleton uniqueInstance = null;

    //构造函数私有,所以杜绝的外部类构造其对象的可能,只有自己能构造
    private Singleton() {

    };

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
