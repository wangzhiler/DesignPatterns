package com.design_pattern_firsthead.demo06_command.tradition;

/**
 * Created by thinkpad on 2018/7/18.
 */
public interface Control {
    public void onButton(int slot);

    public void offButton(int slot);
}
