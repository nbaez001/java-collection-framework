package com.empresa.proyecto.arrays;

public class VariableAssignments {
    public static void main(String[] args) {
        int[] x = new int[2];
        int[] a = x;
        x[0] = 1;
        System.out.println(x[0]);
        System.out.println(a[0]);
        a[1] = 2;
        System.out.println(x[1]);
        System.out.println(a[1]);


        int[] b = {1, 2, 3};
        int[] c = {11, 22};
        b = c;
        c = b;
        for (int e : b) {
            System.out.println(e);
        }
        for (int e : c) {
            System.out.println(e);
        }


        String[] s = new String[3];
        Object[] objArray = s;


        short[] shorts = new short[2];  //[S
        //int[] ints = shorts;            //[I

    }
}
