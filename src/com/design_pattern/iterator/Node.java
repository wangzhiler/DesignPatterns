package com.design_pattern.iterator;

/**
 * Created by thinkpad on 2018/4/10.
 */
public class Node {
    private Object o;
    private Node next;

    public Node(Object o, Node next) {
        this.o = o;
        this.next = next;
    }

    public Object getO() {
        return o;
    }

    public void setO(Object o) {
        this.o = o;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "o=" + o +
//                ", next=" + next +
                '}';
    }
}
