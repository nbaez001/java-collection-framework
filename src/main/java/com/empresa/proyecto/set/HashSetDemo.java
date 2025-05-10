package com.empresa.proyecto.set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        // Four constructors
        HashSet st = new HashSet(); // Creates a hash set of capacity of 16
        HashSet hs1 = new HashSet(30); // capacity 30
        HashSet hs2 = new HashSet(100, .80f);
        Collection l = new ArrayList();
        HashSet hs3 = new HashSet(l); // Constructor to create a HashSet from a Collection
    }
}
