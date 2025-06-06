package com.empresa.proyecto.additional.lambda;

public class LambdaExample {
    public static void main(String[] args) {
        FunInterfaceExample in = () -> System.out.println("Function without any argument and return type");
        in.funMehod();
    }
}

interface FunInterfaceExample {
    public void funMehod();
}