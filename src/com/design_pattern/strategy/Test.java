package com.design_pattern.strategy;

/**
 * Created by thinkpad on 2018/4/11.
 */
public class Test {
    public static void main(String[] args) {
        Cat[] a = {new Cat(1, 1), new Cat(3, 3), new Cat(5, 5)};
        DataSort.sort(a);
        DataSort.p(a);

        Dog[] d = {new Dog(3), new Dog(6), new Dog(1)};
        DataSort.sort(d);
        DataSort.p(d);
    }
}
