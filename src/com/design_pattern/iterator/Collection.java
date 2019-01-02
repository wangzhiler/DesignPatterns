package com.design_pattern.iterator;

/**
 * Created by thinkpad on 2018/4/11.
 */
public interface Collection {
    void add(Object o);
    int size();
    Iterator iterator();
}
