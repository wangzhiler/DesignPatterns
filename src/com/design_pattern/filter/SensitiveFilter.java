package com.design_pattern.filter;

public class SensitiveFilter implements Filter {

    @Override
    public String doFilter(String str) {
        String r = str.replace("balala", "lala")
                .replace("敏感", "");
        return r;
    }
}
