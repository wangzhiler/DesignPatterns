package com.design_pattern_firsthead.demo06_command.command;

import com.design_pattern_firsthead.demo06_command.device.*;


public class LightOffCommand implements Command {

    private Light light1;

    public LightOffCommand(Light light) {
        light1 = light;
    }


    @Override
    public void execute() {
        light1.off();
    }

    @Override
    public void undo() {
        light1.On();
    }
}
