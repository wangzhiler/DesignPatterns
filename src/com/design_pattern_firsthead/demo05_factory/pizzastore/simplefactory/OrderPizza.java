package com.design_pattern_firsthead.demo05_factory.pizzastore.simplefactory;

import com.design_pattern_firsthead.demo05_factory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by thinkpad on 2018/7/17.
 */
public class OrderPizza {
    SimplePizzaFactory mSimplePizzaFactory;

    public OrderPizza(SimplePizzaFactory mSimplePizzaFactory) {
        setFactory(mSimplePizzaFactory);
    }

    public void setFactory(SimplePizzaFactory mSimplePizzaFactory) {
        Pizza pizza = null;
        String ordertype;
        this.mSimplePizzaFactory = mSimplePizzaFactory;

        do {
            ordertype = gettype();
            pizza = mSimplePizzaFactory.createPizza(ordertype);
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
