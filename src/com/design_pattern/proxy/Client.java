package com.design_pattern.proxy;

public class Client {

    public static void main(String[] args) throws Exception {
//        Tank t = new Tank();

        Movable m = (Movable) Proxy.newProxyInstance(Movable.class, new TimeHandler());


        //让日志包着时间
//        TankTimeProxy ttp = new TankTimeProxy(t);
//        TankLogProxy tlp = new TankLogProxy(ttp);

//        Movable m = tlp;
        m.move();



    }
}
