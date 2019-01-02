package com.design_pattern_firsthead.demo05_factory.pizzastore.absfactory;

import com.design_pattern_firsthead.demo05_factory.pizzastore.pizza.NYCheesePizza;
import com.design_pattern_firsthead.demo05_factory.pizzastore.pizza.NYPepperPizza;
import com.design_pattern_firsthead.demo05_factory.pizzastore.pizza.Pizza;

/**
 * Created by thinkpad on 2018/7/17.
 */
public class NYFactory implements AbsFactory {
    @Override
    public Pizza CreatePizza(String ordertype) {
        Pizza pizza = null;
        if (ordertype.equals("cheese")) {
            pizza = new NYCheesePizza();
        } else if (ordertype.equals("pepper")) {
            pizza = new NYPepperPizza();
        }

        return pizza;
    }
}
