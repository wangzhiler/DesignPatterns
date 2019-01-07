package com.design_pattern_firsthead.demo09_template;

public class MainTest {
    public static void main(String[] args) {
        HotDrink mCoffee = new Coffee();
        HotDrink mTea = new Tea();
        mCoffee.prepareRecipe();
        mTea.prepareRecipe();

        TeaWithHook tea = new TeaWithHook();
        tea.prepareRecipe();

    }
}
