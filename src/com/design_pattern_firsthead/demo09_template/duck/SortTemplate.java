package com.design_pattern_firsthead.demo09_template.duck;

public abstract class SortTemplate {

    public final void sort(Object[] objects) {
        for (int i = 0, len = objects.length - 1; i < len; i++) {
            if (compare(objects[i + 1]) > 0) {
                // swap()
            } else {

            }
        }
    }

    protected abstract int compare(Object object);
}
