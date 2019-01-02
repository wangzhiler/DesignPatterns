package com.design_pattern.strategy;

/**
 * Created by thinkpad on 2018/4/11.
 */
public class Dog implements Comparable{
    private int food;

    public Dog(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return food+"";
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Dog) {
            Dog d = (Dog) o;
            if (this.food>d.food) return 1;
            else if(this.food<d.food) return -1;
            else return 0;
        }
        return -100;
    }
}
