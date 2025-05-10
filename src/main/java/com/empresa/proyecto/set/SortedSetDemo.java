package com.empresa.proyecto.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
    public static void main(String[] args) {
        SortedSet s = new TreeSet();
        s.add(5);
        s.add(10);
        s.add(2);
        s.add(1);
        s.add(3);
        s.add(7);
        System.out.println(s);

        //Methods in SortedSet Interface
        // first() returns the first element
        System.out.println(s.first());
        // last() returns the last element
        System.out.println(s.last());
        // headSet(Object o) returns the elements that are coming just before the object o
        System.out.println(s.headSet(3));
        // tailSet(Object o) returns the elements that are coming after the object o inclusive
        System.out.println(s.tailSet(3));
        // subSet(Object o, Object p) returns a subset having all the elements between the first parameter(included) and the last parameter
        System.out.println(s.subSet(3,7));
        // comparator() returns the order of the sorting of this sorted set, by default for natural returning order return null
        System.out.println(s.comparator());
    }
}
