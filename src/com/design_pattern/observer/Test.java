package com.design_pattern.observer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

class Child implements Runnable{
    private List<WakenUpListener> wakenUpListeners = new ArrayList<>();

    public void addWakenUpListener(WakenUpListener i) {
        wakenUpListeners.add(i);
    }

    void wakeUp() {
        for (int i = 0; i < wakenUpListeners.size(); i++) {
            WakenUpListener l = wakenUpListeners.get(i);
            l.ActionToWakenUp(new WakenUpEvent(System.currentTimeMillis(), "bed", this));
        }
    }

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.wakeUp();
    }
}

class Dad implements WakenUpListener {

    @Override
    public void ActionToWakenUp(WakenUpEvent wakenUpEvent) {
        System.out.println("feedChild: " + wakenUpEvent);
    }
}

class GrandFather implements WakenUpListener {

    @Override
    public void ActionToWakenUp(WakenUpEvent wakenUpEvent) {
        System.out.println("hugChild: " + wakenUpEvent);
    }
}

interface WakenUpListener {
    void ActionToWakenUp(WakenUpEvent wakenUpEvent);
}

public class Test {

    public static void main(String[] args) {
        Child c = new Child();

        Properties properties = new Properties();
        try {
            properties.load(Test.class.getClassLoader()
                    .getResourceAsStream("com/design_pattern/observer/observer.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] observers = properties.getProperty("observers").split(",");

        for (String s : observers) {
            try {
                c.addWakenUpListener((WakenUpListener) Class.forName(s).newInstance());
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        new Thread(c).start();
    }
}

class PropertyMgr {

    private static Properties properties = new Properties();

    static {
        try {
            properties.load(Test.class.getClassLoader()
                    .getResourceAsStream("com/design_pattern/observer/observer.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }
}