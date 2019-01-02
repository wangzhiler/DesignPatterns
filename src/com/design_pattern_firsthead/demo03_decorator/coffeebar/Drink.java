package com.design_pattern_firsthead.demo03_decorator.coffeebar;

/**
 * Created by thinkpad on 2018/7/15.
 */
public abstract class Drink {
    public String description="";
    private float price = 0f;


    public abstract float cost();

    public String getDescription() {
        return description + "-" + this.getPrice();
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
