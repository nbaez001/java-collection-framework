package com.empresa.proyecto.arrays;

public class TraversingArrays {
    public static void main(String[] args) {
        int[] a = new int[5];
        for (int e : a) {
            System.out.println(e);
        }

        int length = a.length;
        for (int i = 0; i < length; i++) {
            a[i] = i + 1;
            System.out.println("element at index " + i + " is: " + a[i]);
        }

        int[][] b = new int[2][3];
        for (int[] arr : b) {
            for (int el : arr) {
                System.out.println(el);
            }
        }

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.println(b[i][j]);
            }
        }
    }
}
