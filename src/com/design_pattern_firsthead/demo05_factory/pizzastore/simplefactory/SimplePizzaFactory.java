package com.design_pattern_firsthead.demo05_factory.pizzastore.simplefactory;

import com.design_pattern_firsthead.demo05_factory.pizzastore.pizza.CheesePizza;
import com.design_pattern_firsthead.demo05_factory.pizzastore.pizza.GreekPizza;
import com.design_pattern_firsthead.demo05_factory.pizzastore.pizza.PepperPizza;
import com.design_pattern_firsthead.demo05_factory.pizzastore.pizza.Pizza;

/**
 * Created by thinkpad on 2018/7/17.
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String ordertype) {
        Pizza pizza = null;
        if (ordertype.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (ordertype.equals("greek")) {
            pizza = new GreekPizza();
        } else if (ordertype.equals("pepper")) {
            pizza = new PepperPizza();
        }
        return pizza;
    }
}
