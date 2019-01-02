package com.design_pattern.iterator;

/**
 * Created by thinkpad on 2018/4/10.
 */
public class LinkedList implements Collection {

    Node head = null;
    Node tail = null;
    int size = 0;

    public void add(Object o) {
        Node n = new Node(o, null);
        if (head == null) {
            head = n;
            tail = n;
        }
        tail.setNext(n);
        tail = n;
        size++;
    }

    public int size() {
        return size;
    }

    @Override
    public Iterator iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator {

        Node node = head;

        @Override
        public Object next() {
            Node tmp = node;
            node = node.getNext();
            return tmp;
        }

        @Override
        public Boolean hasNext() {
            return node!= null;
        }
    }

}
