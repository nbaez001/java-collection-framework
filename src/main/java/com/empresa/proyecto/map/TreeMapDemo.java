package com.empresa.proyecto.map;

import java.util.*;

public class TreeMapDemo {

    public static void main(String[] args) {
        // Constructors
        Map m = new TreeMap();

        CustomSort comparator = new CustomSort();
        Map m2 = new TreeMap(comparator);

        SortedMap sm = new TreeMap();
        Map m3 = new TreeMap(sm);

        Map hm = new HashMap();
        Map m4 = new TreeMap(hm);

        // Test
        m.put(23, "");
        m.put(10, "");
        m.put(10, "Basics");
        m.put(11, "String");
        System.out.println(m);

        m2.put("John", 10);
        m2.put("Shiva", 10);
        m2.put("Rohn", 10);
        System.out.println(m2);
    }
}
