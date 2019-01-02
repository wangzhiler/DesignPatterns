package com.design_pattern_firsthead.demo06_command.device;

/**
 * Created by thinkpad on 2018/7/18.
 */
public class Stereo {
    static int volume = 0;

    public void On() {
        System.out.println("Stereo On");
    }

    public void Off() {
        System.out.println("Stereo Off");
    }

    public void SetCd() {
        System.out.println("Stereo setCd");
    }

    public void SetVol(int volume) {
        this.volume = volume;
        System.out.println("Stereo volumn=" + volume);
    }

    public int getVolume() {
        return volume;
    }

    public void Start() {
        System.out.println("Stereo start");
    }
}
