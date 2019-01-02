package com.design_pattern_firsthead.demo05_factory.pizzastore.method;

import com.design_pattern_firsthead.demo05_factory.pizzastore.pizza.LDPepperPizza;
import com.design_pattern_firsthead.demo05_factory.pizzastore.pizza.NYCheesePizza;
import com.design_pattern_firsthead.demo05_factory.pizzastore.pizza.Pizza;

/**
 * Created by thinkpad on 2018/7/17.
 */
public class NYOrderPizza extends OrderPizza {

    @Override
    public Pizza createPizza(String ordertype) {
        Pizza pizza = null;

        if (ordertype.equals("cheese")) {
            pizza = new NYCheesePizza();
        } else if (ordertype.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
