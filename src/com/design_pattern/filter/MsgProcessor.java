package com.design_pattern.filter;

public class MsgProcessor {
    private String msg;

//    Filter[] filters = {new HTMLFilter(), new SensitiveFilter(), new FaceFilter()};
    FilterChain fc;

    public String process() {

//        for (Filter filter : filters) {
//            r = filter.doFilter(r);
//        }

        return fc.doFilter(msg);
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public FilterChain getFc() {
        return fc;
    }

    public void setFc(FilterChain fc) {
        this.fc = fc;
    }
}
