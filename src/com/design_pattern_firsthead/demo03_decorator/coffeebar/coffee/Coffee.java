package com.design_pattern_firsthead.demo03_decorator.coffeebar.coffee;

import com.design_pattern_firsthead.demo03_decorator.coffeebar.Drink;

/**
 * Created by thinkpad on 2018/7/15.
 */
public class Coffee extends Drink {

    @Override
    public float cost() {
        return super.getPrice();
    }
}
