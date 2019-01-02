package com.design_pattern.strategy;

/**
 * Created by thinkpad on 2018/4/11.
 */
public interface Comparable {

    //返回值>0说明比较的对象大，<0说明被比较的对象大
    public int compareTo(Object o);
}
