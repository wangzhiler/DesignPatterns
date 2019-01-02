package com.design_pattern_firsthead.demo05_factory.pizzastore.pizza;

/**
 * Created by thinkpad on 2018/7/17.
 */
public class ChinesePizza extends Pizza {

    @Override
    public void prepare() {
        super.setName("ChinesePizza");
        System.out.println(name + " preparing;");
    }
}
