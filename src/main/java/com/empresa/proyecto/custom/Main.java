package com.empresa.proyecto.custom;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        CustomArrayList<Integer> customList = new CustomArrayList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        long start, end;

        System.out.println("**** TEST ADD ****");
        start = System.nanoTime();
        for (int i = 0; i < 1_000_000; i++) {
            customList.add(i);
        }
        end = System.nanoTime();
        System.out.println("CustomArrayList add: \t" + (end - start) + " ns");

        start = System.nanoTime();
        for (int i = 0; i < 1_000_000; i++) {
            arrayList.add(i);
        }
        end = System.nanoTime();
        System.out.println("ArrayList add: \t\t\t" + (end - start) + " ns");

        System.out.println("\n**** TEST READ ****");
        start = System.nanoTime();
        for (int i = 0; i < 1_000_000; i++) {
            int data = customList.get(i);
        }
        end = System.nanoTime();
        System.out.println("CustomArrayList read: \t" + (end - start) + " ns");

        start = System.nanoTime();
        for (int i = 0; i < 1_000_000; i++) {
            int data = arrayList.get(i);
        }
        end = System.nanoTime();
        System.out.println("ArrayList read: \t\t" + (end - start) + " ns");

        System.out.println("\n**** TEST REMOVE ****");
        start = System.nanoTime();
        for (int i = 500_000; i < 500_100; i++) {
            customList.remove(i);
        }
        end = System.nanoTime();
        System.out.println("CustomArrayList remove: \t" + (end - start) + " ns");

        start = System.nanoTime();
        for (int i = 500_000; i < 500_100; i++) {
            arrayList.remove(i);
        }
        end = System.nanoTime();
        System.out.println("ArrayList remove: \t\t\t" + (end - start) + " ns");
    }
}