package com.design_pattern.proxy.compiler;

import com.design_pattern.proxy.InvocationHandler;
import com.design_pattern.proxy.Movable;
import java.lang.reflect.Method;

public class TankTimeProxy implements com.design_pattern.proxy.Movable {
    com.design_pattern.proxy.InvocationHandler h;

    public TankTimeProxy(InvocationHandler h) {
        this.h = h;
    }

    @Override
    public void move() {
        Method md=null;        try{
            md=com.design_pattern.proxy.Movable.class.getMethod("move");
        } catch (Exception e) {
            e.printStackTrace();
        }
        h.invoke(this, md);
    }
}