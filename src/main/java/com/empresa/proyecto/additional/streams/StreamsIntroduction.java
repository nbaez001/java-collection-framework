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

        List<Integer> newList = new ArrayList<>();
        for (Integer i : list) {
            if (i >= 30) {
                newList.add(i);
            }
        }
        System.out.println(newList);

        // Streams filter
        List<Integer> l1 = list.stream()
                .filter(i -> i >= 30)
                .collect(Collectors.toList());
        System.out.println(l1);

        // Streams map
        List<Integer> l2 = list.stream()
                .map(i -> i * 2)
                .collect(Collectors.toList());
        System.out.println(l2);
    }
}
