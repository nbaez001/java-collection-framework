package com.empresa.proyecto.arrays;

public class PlayingWithSyntax {

    public static void main(String[] args) {
        int[]  x1;	//most precise syntax to follow
        int [] x2;
        int x3[];

        int x4[],x5[];
        int []x6,x7[];
        int[] x8, x9;

        int[][] x11;	//most precise syntax
        int [][]x12;
        int [][] x13;

        int []x14[];
        int x15[][];
        int[][] x16,x17;

        int[] x18[],x19;	//int[] is both, so x18 is 2-D array and x19 is 1-D array

        int[] []x20,x21;	//both are 2-D array

        int[] [] [] x22,x23;	//both are 3-D array

        int [][][] x25 = new int [3][4][5];
        int [][][] x26 = new int [3][4][];
    }
}
