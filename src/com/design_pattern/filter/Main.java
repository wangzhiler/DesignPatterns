package com.design_pattern.filter;

public class Main {

    public static void main(String[] args) {
        String msg = "大家好:), <script>, 敏感, 123, balala";
        MsgProcessor mp = new MsgProcessor();
        mp.setMsg(msg);

        FilterChain fc = new FilterChain();
        fc.addFilter(new HTMLFilter())
                .addFilter(new FaceFilter());

        FilterChain fc2 = new FilterChain();
        fc2.addFilter(new SensitiveFilter());

        fc.addFilter(fc2);

        mp.setFc(fc);

        String result = mp.process();
        System.out.println(result);
    }
}
