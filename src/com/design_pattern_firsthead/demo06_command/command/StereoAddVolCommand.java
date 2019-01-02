package com.design_pattern_firsthead.demo06_command.command;

import com.design_pattern_firsthead.demo06_command.device.*;


public class StereoAddVolCommand implements Command {

    Stereo stereo;

    public StereoAddVolCommand(Stereo stereo1) {
        stereo = stereo1;
    }

    @Override
    public void execute() {

        int vol = stereo.getVolume();
        if (vol < 11) {
            stereo.SetVol(++vol);
        }
    }

    @Override
    public void undo() {
        int vol = stereo.getVolume();
        if (vol > 0) {
            stereo.SetVol(--vol);
        }
    }
}
