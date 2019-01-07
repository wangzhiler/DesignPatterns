package com.design_pattern_firsthead.demo09_template.duck;

public class Duck implements Comparable {

    String name = "";
    int weight = 1;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Duck buf = (Duck) o;
        if (this.weight > buf.weight) {
            return 1;
        } else if (this.weight < buf.weight) {
            return -1;
        }

        return 0;
    }
}
