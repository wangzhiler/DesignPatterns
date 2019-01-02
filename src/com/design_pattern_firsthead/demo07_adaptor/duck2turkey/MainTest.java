package com.design_pattern_firsthead.demo07_adaptor.duck2turkey;

public class MainTest {

    public static void main(String[] args) {
        GreenheadDuck duck = new GreenheadDuck();
        WildTurkey turkey = new WildTurkey();

//        Duck duck2turkeyAdapter = new TurkeyAdapter(turkey);
        Duck duck2turkeyAdapter = new TurkeyAdapter2();
        turkey.gobble();
        turkey.fly();
        duck.quack();
        duck.fly();

        duck2turkeyAdapter.fly();
        duck2turkeyAdapter.quack();
    }
}
