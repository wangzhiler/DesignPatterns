package com.design_pattern_firsthead.demo05_factory.pizzastore.method;

import com.design_pattern_firsthead.demo05_factory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by thinkpad on 2018/7/17.
 */
public abstract class OrderPizza {
    public OrderPizza() {
        Pizza pizza = null;
        String ordertype;

        do {
            ordertype = gettype();
            pizza = createPizza(ordertype);
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }

    public abstract Pizza createPizza(String ordertype);

    private String gettype() {
        BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input pizza type:");
        try {
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

}
