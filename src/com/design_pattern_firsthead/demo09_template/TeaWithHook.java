package com.design_pattern_firsthead.demo09_template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TeaWithHook extends HotDrinkTemplate {

    @Override
    protected void brew() {
        System.out.println("brewing tea");
    }

    @Override
    protected void addCondiments() {
        System.out.println("adding lemon");
    }

    @Override
    public boolean wantCondimentsHook() {
        System.out.println("Condiments, yes/no? please input(y/n):");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String result = "";
        try {
            result = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (result.equals("n")) {
            return false;
        }

        return true;
    }


}
