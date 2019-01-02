package com.design_pattern_firsthead.demo07_adaptor.duck2turkey;

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("WildTurkey: gogo");
    }

    @Override
    public void fly() {
        System.out.println("WildTurkey: short distance");
    }
}
