package com.design_pattern_firsthead.demo07_adaptor.duck2turkey;

public class TurkeyAdapter2 extends WildTurkey implements Duck {

    @Override
    public void quack() {
        super.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 3; i++) {
            super.fly();
        }
    }
}
