package com.empresa.proyecto.additional.lambda;

public class LambdaIntroduction {
    public static void main(String[] args) {
        MyFunctionalInterface funInterLambda = () -> System.out.println("Functional method");
        funInterLambda.funMethod();
    }
}

interface MyFunctionalInterface{
    public void funMethod();
}