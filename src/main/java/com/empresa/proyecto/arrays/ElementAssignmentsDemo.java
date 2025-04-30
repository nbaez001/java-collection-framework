package com.empresa.proyecto.arrays;

public class ElementAssignmentsDemo {
    public static void main(String[] args) {
        int[] x = new int[3];
        x[0] = 'a';
        System.out.println(x[0]);
        byte b = 2;
        x[1] = b;

        Object[] objArray = new Object[5];
        objArray[0] = new Object();
        objArray[1] = new String();

        Number[] numArray = new Number[3]; // It has 6 child classes Byte, Short, Integer, Long, Float, Double
        numArray[0] = new Integer(1);
        numArray[1] = new Byte("2");

        Runnable[] r = new Runnable[5];
        r[0] = new Thread();
        System.out.println(r[1]);
    }
}
