package com.design_pattern.proxy;

public class TankTimeProxy implements Movable {
    Movable t;

    public TankTimeProxy(Movable t) {
        this.t = t;
    }

    @Override
    public void move() {
        long start = System.currentTimeMillis();
        t.move();
        long end = System.currentTimeMillis();
        System.out.println("time: " + (end - start));
    }

//    @Override
//    public void stop() {
//        long start = System.currentTimeMillis();
//        t.stop();
//        long end = System.currentTimeMillis();
//        System.out.println("time: " + (end - start));
//    }
}
