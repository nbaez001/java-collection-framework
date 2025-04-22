package com.empresa.proyecto.arrays;

public class ArrayIntroduction {
    public static void main(String[] args) {
        int a = 12;
        int b = 13;
        int c = 14;

        int[] x = new int[100];
        //System.out.println(x.getClass().getName());

        byte length = 127;     // byte range: -128 to 127
        int[] w = new int[length];
        short length2 = 32767; // short range: -32,768 to 32,767
        int[] y = new int[length2];
        short length3 = 'a';
        int[] z = new int[length3];
        int length4 = 2147483647; // int range: -2,147,483,648 to 2,147,483,647
        int[] o = new int[length4];

        int[] p = new int[-1];
    }
}