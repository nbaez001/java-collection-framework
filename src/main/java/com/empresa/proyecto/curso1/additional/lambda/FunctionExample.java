package com.empresa.proyecto.curso1.additional.lambda;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        String s = "BasicsStrong";
        Function<String, Integer> fun = (text) -> text.length();
        int length = fun.apply(s);
        System.out.println(length);
    }
}
