package com.design_pattern.filter2_web;

public interface Filter {

    void doFilter(Request request, Response response, FilterChain chain);

}
