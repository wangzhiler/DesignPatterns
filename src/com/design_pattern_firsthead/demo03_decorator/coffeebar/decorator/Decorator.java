package com.design_pattern_firsthead.demo03_decorator.coffeebar.decorator;

import com.design_pattern_firsthead.demo03_decorator.coffeebar.Drink;

/**
 * Created by thinkpad on 2018/7/15.
 */
public class Decorator extends Drink {

    private Drink Obj;

    public Decorator(Drink obj) {
        this.Obj = obj;
    }

    @Override
    public float cost() {
        return super.getPrice() + Obj.cost();
    }

    @Override
    public String getDescription() {
        //d递归
        return super.getDescription() + "&&" + Obj.getDescription();
    }
}
