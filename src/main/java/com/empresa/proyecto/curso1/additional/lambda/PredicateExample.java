package com.empresa.proyecto.curso1.additional.lambda;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        int salary = 3000;
        Predicate<Integer> p = (value) -> value >= 4000;
        boolean result = p.test(salary);
        System.out.println(result);
    }
}
