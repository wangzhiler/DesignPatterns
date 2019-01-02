package com.design_pattern.iterator;

/**
 * Created by thinkpad on 2018/4/10.
 */
public class Cat {
    private int id;

    public Cat(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "cat:" + id;
    }
}
