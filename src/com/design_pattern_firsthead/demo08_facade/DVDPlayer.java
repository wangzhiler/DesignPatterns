package com.design_pattern_firsthead.demo08_facade;

public class DVDPlayer {

    private static DVDPlayer instance = null;

    private DVDPlayer() {

    }

    public static DVDPlayer getInstance() {
        if (instance == null) {
            instance = new DVDPlayer();
        }
        return instance;
    }

    public void on() {
        System.out.println("DVDPlayer on");
    }

    public void off() {
        System.out.println("DVDPlayer off");
    }

    public void play() {
        System.out.println("DVDPlayer is playing");
    }

    public void pause() {
        System.out.println("DVDPlayer pause");
    }

    public void setDvd() {
        System.out.println("DVDPlayer is setting dvd");
    }

}
