package com.design_pattern_firsthead.demo01_strategy;

//行为族的具体实现
public class AAAQuackBehavior implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("--AAAQuackBehavior");
    }
}
