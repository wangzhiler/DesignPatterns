package com.design_pattern.observer.awt;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Button b = new Button();
        b.addActionListener(new MyActionListener());
        b.addActionListener(new MyActionListener2());
        b.buttonPressed();
    }
}


class Button {

    private List<ActionListener> actionListeners = new ArrayList<>();

    public void addActionListener(ActionListener actionListener) {
        actionListeners.add(actionListener);
    }

    public void buttonPressed() {
        ActionEvent e = new ActionEvent(System.currentTimeMillis(), this);
        for (int i = 0; i < actionListeners.size(); i++) {
            ActionListener l = actionListeners.get(i);
            l.actionPerformed(e);
        }
    }
}

class MyActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("button pressed!" + e);
    }
}

class MyActionListener2 implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("2222 pressed!" + e);
    }
}

interface ActionListener {
    public void actionPerformed(ActionEvent e);
}

class ActionEvent {
    long when;
    Object source;

    public ActionEvent(long when, Object source) {
        this.when = when;
        this.source = source;
    }

    public long getWhen() {
        return when;
    }

    public Object getSource() {
        return source;
    }

    @Override
    public String toString() {
        return "ActionEvent{" +
                "when=" + when +
                ", source=" + source +
                '}';
    }
}