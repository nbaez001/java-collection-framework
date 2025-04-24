package com.empresa.proyecto.arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] x;
        int[] y = {1, 2, 3, 4, 5};
        int[] z = new int[3];
        z[0] = 10;
        z[1] = 20;
        z[2] = 30;
        for (int ele : z) {
            System.out.println(ele);
        }

        int[][] a;
        int[][] b = new int[2][];
        System.out.println(b[0]);
        int[][] c = {{1, 2, 3}, {6, 7}};
        for (int[] array : c) {
            for (int ele : array) {
                System.out.println(ele);
            }
        }
    }
}
