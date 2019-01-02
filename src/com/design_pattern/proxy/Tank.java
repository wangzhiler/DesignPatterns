package com.design_pattern.proxy;

import java.util.Random;

public class Tank implements Movable {
    @Override
    public void move() {
        System.out.println("tank is moving");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

//    @Override
//    public void stop() {
//        System.out.println("tank is stopping");
//        try {
//            Thread.sleep(new Random().nextInt(10000));
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
}
