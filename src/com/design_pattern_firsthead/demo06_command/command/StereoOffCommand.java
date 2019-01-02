package com.design_pattern_firsthead.demo06_command.command;

import com.design_pattern_firsthead.demo06_command.device.*;

public class StereoOffCommand implements Command {

    Stereo stereo;

    public StereoOffCommand(Stereo stereo1) {
        stereo = stereo1;
    }

    @Override
    public void execute() {
        stereo.Off();
    }

    @Override
    public void undo() {
        stereo.On();
    }
}
