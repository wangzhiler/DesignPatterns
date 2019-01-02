package com.design_pattern_firsthead.demo03_decorator.coffeebar.decorator;

import com.design_pattern_firsthead.demo03_decorator.coffeebar.Drink;

/**
 * Created by thinkpad on 2018/7/15.
 */
public class Milk extends Decorator {
    public Milk(Drink obj) {
        super(obj);
        super.setDescription("Milk");
        super.setPrice(2.0f);
    }
}
