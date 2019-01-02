package com.design_pattern_firsthead.demo06_command.command;

import com.design_pattern_firsthead.demo06_command.device.*;


public class LightOnCommand implements Command {

    private Light light1;

    public LightOnCommand(Light light) {
        light1 = light;
    }

    @Override
    public void execute() {
        light1.On();
    }

    @Override
    public void undo() {
        light1.off();
    }
}
