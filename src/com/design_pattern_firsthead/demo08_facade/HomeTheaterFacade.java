package com.design_pattern_firsthead.demo08_facade;

public class HomeTheaterFacade {
    private Screen screen;
    private Projector projector;
    private Popcorn popcorn;
    private DVDPlayer dvdPlayer;

    public HomeTheaterFacade() {
        screen = Screen.getInstance();
        projector = Projector.getInstance();
        popcorn = Popcorn.getInstance();
        dvdPlayer = DVDPlayer.getInstance();
    }

    public void ready() {
        screen.down();
        projector.on();
        popcorn.on();
        dvdPlayer.on();
    }

    public void end() {
        screen.up();
        projector.off();
        popcorn.off();
        dvdPlayer.off();
    }

    public void play() {
        dvdPlayer.play();
    }

    public void pause() {
        dvdPlayer.pause();
    }
}
