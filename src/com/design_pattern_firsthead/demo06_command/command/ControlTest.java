package com.design_pattern_firsthead.demo06_command.command;

import com.design_pattern_firsthead.demo06_command.device.*;

/**
 * Created by thinkpad on 2018/7/18.
 */
public class ControlTest {

    public static void main(String[] args) {

        CommandModeControl control = new CommandModeControl();

        MarcoCommand onmarco, offmarco;

        Light bedrommLight = new Light("bedroom");
        Light kitchLight = new Light("kitch");
        Stereo stereo = new Stereo();

        LightOnCommand bedroomLightOn = new LightOnCommand(bedrommLight);
        LightOffCommand bedroomLightOff = new LightOffCommand(bedrommLight);
        LightOnCommand kitchLightOn = new LightOnCommand(kitchLight);
        LightOffCommand kitchLightOff = new LightOffCommand(kitchLight);


        Command[] commandsOn = {bedroomLightOn, kitchLightOn};
        onmarco = new MarcoCommand(commandsOn);
        Command[] commandsOff = {bedroomLightOff, kitchLightOff};
        offmarco = new MarcoCommand(commandsOff);



        StereoOnCommand stereoOn = new StereoOnCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        StereoAddVolCommand stereoAddVol = new StereoAddVolCommand(stereo);
        StereoSubVolCommand stereoSubVol = new StereoSubVolCommand(stereo);

        control.setCommand(0, bedroomLightOn, bedroomLightOff);
        control.setCommand(1, kitchLightOn, kitchLightOff);
        control.setCommand(2, stereoOn, stereoOff);
        control.setCommand(3, stereoAddVol, stereoSubVol);
        control.setCommand(4, onmarco, offmarco);

        control.onButton(4);
        control.offButton(4);
        System.out.println("-----------------");

        control.onButton(0);
        control.onButton(1);
        control.onButton(2);
        control.onButton(3);
        control.onButton(3);
        control.onButton(3);
        control.undoButton();
        control.undoButton();

        control.offButton(0);
        control.offButton(1);
        control.offButton(2);
        control.undoButton();

        control.offButton(3);

    }
}
