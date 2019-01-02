package com.design_pattern.strategy;

/**
 * Created by thinkpad on 2018/4/11.
 */
public class DataSort {

    public static void sort(Object[] a) {
        for(int i=a.length;i>0; i--) {
            for(int j=0; j<i-1; j++) {
                Comparable c1 = (Comparable) a[j];
                Comparable c2 = (Comparable) a[j + 1];
                if (c1.compareTo(c2)==1) {
                    swap(a, j, j + 1);
                }
            }
        }
    }

    private static void swap(Object[] a, int x, int y) {
        Object temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

    public static void p(Object[] a) {
        for(int i=0; i<a.length; i++) {
            System.out.println(a[i] + " ");
        }
        System.out.println();
    }
}
