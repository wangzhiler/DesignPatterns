package com.design_pattern_firsthead.demo09_template;

public class Coffee extends HotDrink {
    @Override
    protected void addCondiments() {
        System.out.println("adding sugar and milk");
    }

    @Override
    protected void brew() {
        System.out.println("Brewing coffee");
    }
}
