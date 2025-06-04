package com.empresa.proyecto.concurrentcollection;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(0, "Basics");
        map.put(1, "Strong");
        map.put(0, "Tech");
        System.out.println(map);
        map.remove(1);

        // Methods of Concurrent Map
        // V putIfAbsent(K key, V value);
        map.putIfAbsent(0, "Hello");
        // boolean remove(0bject key, Object value);
        // It only removes the entry if both key and value match the entry
        map.remove(1, "Strong");
        // boolean replace(K key, V oldValue, V newVa1ue);
        // It only replaces the entry if both key and value match the entry to be replaced
        map.replace(0,"Tech","Know");
        // V replace(K key, V value);
        // It replaces the entry value if the key matches any of the entries
        String replacedValue = map.replace(0,"Basics Strong");
        System.out.println(replacedValue);
        System.out.println(map);
    }
}
