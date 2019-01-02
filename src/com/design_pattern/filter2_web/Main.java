package com.design_pattern.filter2_web;

public class Main {

    public static void main(String[] args) {
        String msg = "大家好:), <script>, 敏感, 123, balala";

        Request request = new Request();
        request.setRequestStr(msg);
        Response response = new Response();
        response.setResponseStr("response");


        FilterChain fc = new FilterChain();
        fc.addFilter(new HTMLFilter())
                .addFilter(new FaceFilter());

        FilterChain fc2 = new FilterChain();
        fc2.addFilter(new SensitiveFilter());

        fc.addFilter(fc2);

        fc.doFilter(request, response, fc);

        System.out.println(request.getRequestStr());
        System.out.println(response.getResponseStr());

    }
}
