package com.design_pattern_firsthead.demo08_facade;

public class MainTest {
    public static void main(String[] args) {
        HomeTheaterFacade facade = new HomeTheaterFacade();

        facade.ready();

        facade.play();

        facade.pause();

        facade.end();
    }
}
