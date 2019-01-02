package com.design_pattern_firsthead.demo04_singleton;

/**
 * Created by thinkpad on 2018/7/16.
 */
public class Test {
    private class Abc {
        private Abc() {
        }
    }

    public class Cbd {
        public Cbd() {
            Abc n1, n2;
            n1 = new Abc();
            n2 = new Abc();
        }
    }

}
