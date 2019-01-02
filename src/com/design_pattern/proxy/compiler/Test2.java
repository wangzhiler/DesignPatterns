package com.design_pattern.proxy.compiler;

import java.lang.reflect.Method;

public class Test2 {
    public static void main(String[] args) {
        Method[] methods = com.design_pattern.proxy.Movable.class.getMethods();
        for (Method m : methods) {
            System.out.println(m);
        }
    }
}
