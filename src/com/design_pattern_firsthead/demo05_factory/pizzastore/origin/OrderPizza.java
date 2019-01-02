package com.design_pattern_firsthead.demo05_factory.pizzastore.origin;

import com.design_pattern_firsthead.demo05_factory.pizzastore.pizza.CheesePizza;
import com.design_pattern_firsthead.demo05_factory.pizzastore.pizza.GreekPizza;
import com.design_pattern_firsthead.demo05_factory.pizzastore.pizza.PepperPizza;
import com.design_pattern_firsthead.demo05_factory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by thinkpad on 2018/7/17.
 *
 * 添加某种pizza需要改这个类，这样不好
 */
public class OrderPizza {

    public OrderPizza() {
        Pizza pizza = null;
        String ordertype;

        do{
            ordertype = gettype();
            if (ordertype.equals("cheese")) {
                pizza = new CheesePizza();
            } else if (ordertype.equals("greek")) {
                pizza = new GreekPizza();
            } else if (ordertype.equals("pepper")) {
                pizza = new PepperPizza();
            } else {
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while(true);
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
