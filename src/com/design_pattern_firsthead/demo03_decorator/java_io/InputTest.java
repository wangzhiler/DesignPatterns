package com.design_pattern_firsthead.demo03_decorator.java_io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by thinkpad on 2018/7/15.
 */
public class InputTest {
    public static void main(String[] args) {
        int c = 0;
        try {
            InputStream in = new UpperCaseInputStream(new BufferedInputStream(
                    new FileInputStream("D:\\project\\DesignPatterns\\src\\com\\design_pattern_firsthead\\demo03_decorator\\java_io\\test.txt")
            ));
            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
