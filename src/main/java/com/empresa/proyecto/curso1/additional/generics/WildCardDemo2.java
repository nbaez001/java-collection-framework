package com.empresa.proyecto.curso1.additional.generics;

import java.util.ArrayList;
import java.util.List;

public class WildCardDemo2 {
    public static void displayData(List<? super Integer> l) {
        for (Object t : l) {
            System.out.println(t);
        }
        l.add(10);
    }

    public static void main(String[] args) {
        List<? super Integer> list = new ArrayList<Integer>();
        List<? super Integer> list2 = new ArrayList<Number>();
        Integer n =12;
        list.add(n);
        list2.add(n);
    }
}
