package com.design_pattern_firsthead.demo06_command.command;

import com.design_pattern_firsthead.demo06_command.device.*;

public class StereoOnCommand implements Command {


    Stereo stereo;

    public StereoOnCommand(Stereo stereo1) {
        stereo = stereo1;
    }
    @Override
    public void execute() {
        stereo.On();
        stereo.SetCd();


    }

    @Override
    public void undo() {
        stereo.Off();
    }
}
