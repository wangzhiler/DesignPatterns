package com.design_pattern_firsthead.demo06_command.command;

/**
 * Created by thinkpad on 2018/7/18.
 */
public interface Control {
     void onButton(int slot);

     void offButton(int slot);

     void undoButton();
}
