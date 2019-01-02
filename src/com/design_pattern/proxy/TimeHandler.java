package com.design_pattern.proxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TimeHandler implements InvocationHandler {

    private Object target;

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    @Override
    public void invoke(Object o, Method m) {
        long start = System.currentTimeMillis();
        try {
            m.invoke(o);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("time: " + (end - start));
    }
}
