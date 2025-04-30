package com.empresa.proyecto.arrays;

public class AnonymousArrays {
    public static void main(String[] args) {
        sum(new int[]{1, 2, 3});

    }

    private static void sum(int[] ints) {
        int total = 0;
        for (int e : ints) {
            total += total ;
        }
    }
}
