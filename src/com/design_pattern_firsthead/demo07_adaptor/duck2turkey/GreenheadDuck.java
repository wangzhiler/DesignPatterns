package com.design_pattern_firsthead.demo07_adaptor.duck2turkey;

public class GreenheadDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Greenhead: gaga");
    }

    @Override
    public void fly() {
        System.out.println("Greenhead: long distance");
    }
}
