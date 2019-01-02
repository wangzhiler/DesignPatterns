package com.design_pattern_firsthead.demo05_factory.pizzastore.absfactory;

import com.design_pattern_firsthead.demo05_factory.pizzastore.pizza.Pizza;

/**
 * Created by thinkpad on 2018/7/17.
 */
public interface AbsFactory {
    public Pizza CreatePizza(String ordertype);
}
