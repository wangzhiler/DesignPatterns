package com.design_pattern_firsthead.demo03_decorator.coffeebar.decorator;

import com.design_pattern_firsthead.demo03_decorator.coffeebar.Drink;

/**
 * Created by thinkpad on 2018/7/15.
 */
public class Chocolate extends Decorator {
    public Chocolate(Drink obj) {
        super(obj);
        super.setDescription("Chocolate");
        super.setPrice(3.0f);
    }
}
