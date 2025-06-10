package com.empresa.proyecto.curso1.additional.generics;

import java.util.ArrayList;
import java.util.List;

public class WildCardDemo {
    public static void displayData(List<?> l) {
        for (Object t : l) {
            System.out.println(t);
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(57);
        displayData(list);
    }
}
