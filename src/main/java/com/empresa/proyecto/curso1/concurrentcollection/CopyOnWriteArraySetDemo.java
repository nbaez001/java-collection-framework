package com.empresa.proyecto.curso1.concurrentcollection;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetDemo {

    public static void main(String[] args) {
        Set<String> set = new CopyOnWriteArraySet<>();

        List<String> list = new ArrayList<>();
        list.add("Basics");
        list.add("Basics");
        list.add("Strong");
        list.add("Strong");
        Set<String> set2 = new CopyOnWriteArraySet<>(list);
        System.out.println(set2);
    }
}
