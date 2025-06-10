package com.empresa.proyecto.curso1.additional.lambda;

public class DoubleColonMethodReference {
    public static void main(String[] args) {
        MyFunInterfaceNew in = () -> System.out.println("I am Lambda");
        in.method1();
    }
    // static
    public static void method2() {
        System.out.println("I am not a Lambda");
    }
    // instance
    public void method3() {
        System.out.println("I am not a Lambda from an instance");
    }
}

interface MyFunInterfaceNew {
    public void method1();
}

class NewCallerClass {
    public static void main(String[] args) {
        MyFunInterfaceNew in = DoubleColonMethodReference::method2;
        in.method1();

        DoubleColonMethodReference obj = new DoubleColonMethodReference();
        MyFunInterfaceNew in2 = obj::method3;
        in2.method1();
    }
}