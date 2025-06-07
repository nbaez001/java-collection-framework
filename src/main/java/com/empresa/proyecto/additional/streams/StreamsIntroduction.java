package com.empresa.proyecto.additional.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsIntroduction {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);

        // Streams count
        long count = list.stream().filter(i -> i >= 30).count();
        System.out.println(count);

        // Default Natural Sorting: sorted()
        List<Integer> l3 = list.stream().sorted().collect(Collectors.toList());
        System.out.println(l3);

        // Custom sorting: sorted(Comparator c)
        List<Integer> l4 = list.stream().sorted((i1, i2) -> i2.compareTo(i1))
                .collect(Collectors.toList());
        System.out.println(l4);
    }
}