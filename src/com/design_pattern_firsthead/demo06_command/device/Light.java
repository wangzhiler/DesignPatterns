package com.design_pattern_firsthead.demo06_command.device;

/**
 * Created by thinkpad on 2018/7/18.
 */
public class Light {
    String loc = "";

    public Light(String loc) {
        this.loc = loc;
    }

    public void On() {
        System.out.println(loc + " On");
    }

    public void off() {
        System.out.println(loc + "off");
    }
}
