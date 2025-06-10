package com.empresa.proyecto.curso1.additional.lambda;

@FunctionalInterface
public interface ValidFunInterface2 {

    // By default this is an abstract method
    public void method1();

    // Default method
    default void method2(){

    }

    // Static method
    static void method3(){

    }
}
