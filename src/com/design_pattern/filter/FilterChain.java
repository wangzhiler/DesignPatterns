package com.design_pattern.filter;


import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter{
    List<Filter> filters = new ArrayList<>();

    public FilterChain addFilter(Filter filter) {
        this.filters.add(filter);
        return this;
    }

    public String doFilter(String string) {
        String r = string;
        for (Filter f : filters) {
            r = f.doFilter(r);
        }
        return r;
    }
}
