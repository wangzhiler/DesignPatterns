package com.design_pattern_firsthead.demo06_command.command;

public class MarcoCommand implements Command {

    private Command[] commands;

    public MarcoCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (int i = 0, len = commands.length; i < len; i++) {
            commands[i].execute();
        }
    }

    @Override
    public void undo() {

    }
}
