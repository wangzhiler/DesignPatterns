package com.design_pattern_firsthead.demo08_facade;

public class Popcorn {

    private static Popcorn instance = null;

    private Popcorn() {

    }

    public static Popcorn getInstance() {
        if (instance == null) {
            instance = new Popcorn();
        }
        return instance;
    }

    public void on() {
        System.out.println("popcorn on");
    }

    public void off() {
        System.out.println("popcorn off");
    }

    public void pop() {
        System.out.println("popcorn is popping");
    }
}
