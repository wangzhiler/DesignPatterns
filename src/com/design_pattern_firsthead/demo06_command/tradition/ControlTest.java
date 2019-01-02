package com.design_pattern_firsthead.demo06_command.tradition;

import com.design_pattern_firsthead.demo06_command.device.*;

/**
 * Created by thinkpad on 2018/7/18.
 */
public class ControlTest {

    public static void main(String[] args) {
        Control ctrl;

        Light light = new Light("Bedroom");
        Stereo stereo = new Stereo();
        ctrl = new TraditionControl(light, stereo);

        ctrl.onButton(0);
        ctrl.offButton(0);
        ctrl.onButton(1);
        ctrl.onButton(2);
        ctrl.offButton(2);
        ctrl.offButton(1);

    }
}
