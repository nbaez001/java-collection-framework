package com.empresa.proyecto.additional.lambda;

public class LambdaExample4 {
    public static void main(String[] args) {
        MyFunInterface3 in = (a) -> {
            int x = a + 10;
            x = x / 2;
            return x;
        };
        int op = in.doSomeCalculation(100);
        System.out.println(op);
    }
}

interface MyFunInterface3 {
    public int doSomeCalculation(int a);
}