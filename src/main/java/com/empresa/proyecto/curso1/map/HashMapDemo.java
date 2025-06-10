package com.empresa.proyecto.curso1.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        // This creates a hash map with initial capacity of 16
        // The load factor is 0.75 (same as HashSet)

        Map map2 = new HashMap(20);
        // This creates a hash map with initial capacity of 20

        Map map3 = new HashMap(20, 0.9f);
        // This creates a hash map with initial capacity of 20
        // The load factor is 0.9 (It means when hash map covers 90% of the space, then capacity will get increased)

        Map<String, Integer> marks = new HashMap<>();
        marks.put("Science", 90);
        marks.put("Maths", 80);
        marks.put("English", 90);
        marks.put("FB", 10);
        marks.put("Ea", 10);
        Map map5 = new HashMap(marks);
        System.out.println(map5);
        // Values can be duplicated
        // The hash value for a null key is 0

        System.out.println(marks.get("Ea"));
        // Return the vakue for a key
        System.out.println(marks.size());
        System.out.println(marks.entrySet());
        System.out.println(marks.values());
        System.out.println(marks.containsKey("Ea"));
        System.out.println(marks.remove("FB", 11));
        System.out.println(marks);
        System.out.println(marks.remove("FB", 10));
        System.out.println(marks);

        Map<String, String> marks2 = new HashMap<>();
        System.out.println(marks2.computeIfAbsent("Hello", k -> k + " Basics"));
        System.out.println(marks2);
    }
}
