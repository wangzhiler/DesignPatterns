package com.design_pattern.iterator;

/**
 * Created by thinkpad on 2018/4/10.
 */
public class Test {
    public static void main(String[] args) {
//        ArrayList al = new ArrayList();
//        LinkedList ll = new LinkedList();

        //针对接口编程
        Collection c = new LinkedList();
        for(int i=0; i<15; i++) {
            c.add(new Cat(i));
        }
        System.out.println(c.size());

        Iterator it = c.iterator();
        while (it.hasNext()) {
            Object o = it.next();
            System.out.print(o + " ");
        }


    }
}
