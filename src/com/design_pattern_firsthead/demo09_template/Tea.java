package com.design_pattern_firsthead.demo09_template;

public class Tea extends HotDrink {
    @Override
    protected void addCondiments() {
        System.out.println("add lemon");
    }

    @Override
    protected void brew() {
        System.out.println("brewing tea");
    }
}
