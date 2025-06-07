package com.empresa.proyecto.additional.generics;

import java.util.List;

public class GenericMethod {
    public static <T> String concat(T data) {
        return "Data is: " + data;
    }

    public static void main(String[] args) {
        System.out.println(concat("String"));
        System.out.println(concat(3));
    }
}

class Box {
    private List a;

    public <T> Box(List<T> a) {
        this.a = a;
    }
}
