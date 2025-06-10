package com.empresa.proyecto.curso1.map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> m = new HashMap<>();
        m.put(10,"First");
        m.put(10,"Second");
        System.out.println(m); // {10=Second}

        Map<Integer, String> m2 = new IdentityHashMap<>();
        Integer key = new Integer(10);
        Integer key2 = new Integer(10);
        m2.put(key,"First");
        m2.put(key2,"Second");
        System.out.println(m2); // {10=First, 10=Second}
    }
}
