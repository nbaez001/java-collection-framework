package com.empresa.proyecto.set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet lhs = new LinkedHashSet(); // Capacity 16
        LinkedHashSet lhs1 = new LinkedHashSet(30); // Capacity 30
        LinkedHashSet lhs2 = new LinkedHashSet(20, 1.00f); // Capacity 20 and loadFactor to increment size of 100%
    }
}
