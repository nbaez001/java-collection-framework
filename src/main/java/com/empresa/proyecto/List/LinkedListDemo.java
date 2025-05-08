package com.empresa.proyecto.List;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        //LinkedList ll = new LinkedList(Collection c);
        l.add("John");
        l.add(10);
        l.add(null);
        System.out.println(l);
        l.set(1, 13);
        System.out.println(l);
        l.add(2,true);
        System.out.println(l);
        l.removeLast();
        System.out.println(l);
        l.addFirst(1);
        System.out.println(l);
    }
}
