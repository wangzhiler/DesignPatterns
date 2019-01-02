package com.design_pattern.observer;

public class WakenUpEvent{
    private long time;
    private String location;
    private Object source;

    public WakenUpEvent(long time, String location, Object source) {
        this.time = time;
        this.location = location;
        this.source = source;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Object getSource() {
        return source;
    }

    public void setSource(Object source) {
        this.source = source;
    }

    @Override
    public String toString() {
        return "WakenUpEvent{" +
                "time=" + time +
                ", location='" + location + '\'' +
                ", source=" + source +
                '}';
    }
}
