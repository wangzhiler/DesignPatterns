package com.design_pattern.filter2_web;

public class SensitiveFilter implements Filter {

    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        request.requestStr = request.requestStr.replace("balala", "lala")
                .replace("敏感", "") + "---SensitiveFilter";
        chain.doFilter(request, response, chain);
        response.responseStr += "---SensitiveFilter";

    }
}
