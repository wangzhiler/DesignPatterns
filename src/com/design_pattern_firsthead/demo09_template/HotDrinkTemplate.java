package com.design_pattern_firsthead.demo09_template;

public abstract class HotDrinkTemplate {

    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();

        if (wantCondimentsHook()) {
            addCondiments();
        } else {
            System.out.println("No condiments");
        }
    }

    public boolean wantCondimentsHook() {
        return true;
    }

    public final void boilWater() {
        System.out.println("Boiling water");
    }

    protected abstract void brew();

    protected final void pourInCup() {
        System.out.println("pouring into cup");
    }

    protected abstract void addCondiments();
}
