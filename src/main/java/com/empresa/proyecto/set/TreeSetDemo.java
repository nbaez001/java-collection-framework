package com.empresa.proyecto.set;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();

        //TreeSet ts1 = new TreeSet(Comparator c);

        SortedSet s = new TreeSet();
        TreeSet ts2 = new TreeSet(s);

        HashSet hs = new HashSet();
        TreeSet ts3 = new TreeSet(hs);

        TreeSet<Integer> ts4 = new TreeSet<>(); // All the objects used in TreeSet must implement a comparable class
        TreeSet<Employee> ts5 = new TreeSet<>();
        ts5.add(new Employee("Jhon", 30000));
    }
}
