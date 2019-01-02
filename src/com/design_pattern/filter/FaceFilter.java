package com.design_pattern.filter;

public class FaceFilter implements Filter {
    @Override
    public String doFilter(String str) {
        String r = str.replace(":)", "^V^");
        return r;
    }
}
