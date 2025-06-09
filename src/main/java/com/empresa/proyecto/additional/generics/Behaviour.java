package com.empresa.proyecto.additional.generics;

import java.util.ArrayList;
import java.util.List;

public class Behaviour {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add("Basics");
        l.add("Strong");
        l.add(10);
        l.add(true);
        method(l);
        System.out.println(l);
    }

    public static void method(List<String> l){
        l.add("See this");
    }
}
