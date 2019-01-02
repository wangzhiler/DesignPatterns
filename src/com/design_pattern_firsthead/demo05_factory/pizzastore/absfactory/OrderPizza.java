package com.design_pattern_firsthead.demo05_factory.pizzastore.absfactory;

import com.design_pattern_firsthead.demo05_factory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by thinkpad on 2018/7/17.
 */
public class OrderPizza {
    AbsFactory mFactory;

    public OrderPizza(AbsFactory mFactory) {
        setFactory(mFactory);
    }

    public void setFactory(AbsFactory mFactory) {
        Pizza pizza = null;
        String ordertype;
        this.mFactory = mFactory;

        do {
            ordertype = gettype();
            pizza = mFactory.CreatePizza(ordertype);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }
        } while (true);
    }

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
