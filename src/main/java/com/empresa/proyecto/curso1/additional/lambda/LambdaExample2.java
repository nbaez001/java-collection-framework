package com.empresa.proyecto.curso1.additional.lambda;

public class LambdaExample2 {
    public static void main(String[] args) {
        MyFunInterface in = (a, b) -> System.out.println("Sum of a and b is: " + (a + b));
        in.funMethodAdd(10, 20);
    }
}

interface MyFunInterface {
    public void funMethodAdd(int a, int b);
}