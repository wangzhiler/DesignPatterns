package com.design_pattern_firsthead.demo04_singleton;

/**
 * Created by thinkpad on 2018/7/16.
 */
public class ChocolateFactory {
    private boolean empty;
    private boolean boiled;

    //急切创建对象
    public static ChocolateFactory uniqueInstacne = new ChocolateFactory();

    private ChocolateFactory() {
        empty = true;
        boiled = false;
    }

    public static ChocolateFactory getInstance() {
        if (uniqueInstacne == null) {
            synchronized (ChocolateFactory.class) {
                uniqueInstacne = new ChocolateFactory();
            }
        }
        return uniqueInstacne;
    }

    public void fill() {
        if (empty)
        {
            //添加原料巧克力动作
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if ((!empty) && boiled) {
            //排出巧克力动作
            empty = true;
        }
    }

    public void boil() {
        if ((!empty) && (!boiled)) {
            //煮沸
            boiled = true;
        }
    }
}
