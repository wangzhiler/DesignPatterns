package com.design_pattern_firsthead.demo08_facade;

public class Projector {

    private int size = 5;
    private static Projector instance = null;

    private Projector() {

    }

    public static Projector getInstance() {
        if (instance == null) {
            instance = new Projector();
        }
        return instance;
    }

    public void on() {
        System.out.println("Projector on");
    }

    public void off() {
        System.out.println("Projector off");
    }

    public void focus() {
        System.out.println("Projector focuses");
    }

    public void zoom(int size) {
        this.size = size;
        System.out.println("Projector zoom to " + size);
    }

}
