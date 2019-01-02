package com.design_pattern_firsthead.demo06_command.tradition;


import com.design_pattern_firsthead.demo06_command.device.*;

/**
 * Created by thinkpad on 2018/7/18.
 */
public class TraditionControl implements Control {

    private Light light1;
    Stereo stereo1;

    public TraditionControl() {
    }

    public TraditionControl(Light light, Stereo stereo) {
        light1 = light;
        stereo1 = stereo;
    }

    @Override
    public void onButton(int slot) {
        switch (slot) {
            case 0:
                light1.On();
                break;
            case 1:
                stereo1.On();
                break;
            case 2:
                int vol = stereo1.getVolume();
                if (vol < 11) {
                    stereo1.SetVol(++vol);
                }
                break;
        }
    }

    @Override
    public void offButton(int slot) {
        switch (slot) {
            case 0:
                light1.off();
                break;
            case 1:
                stereo1.Off();
                break;
            case 2:
                int vol = stereo1.getVolume();
                if (vol > 0) {
                    stereo1.SetVol(--vol);
                }
                break;
        }
    }
}
