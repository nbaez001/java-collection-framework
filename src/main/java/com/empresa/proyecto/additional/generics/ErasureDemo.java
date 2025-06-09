package com.empresa.proyecto.additional.generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ErasureDemo {

    public static void main(String[] args){
        //System.out.println(method1(10));

        List l1 = new ArrayList<String>(); // List l1 = new ArrayList();
        l1.add(12);
        l1.add(true);
        l1.add("Hello");
        System.out.println(l1);
    }

    public static String method1(Integer x){
        List<String> a = new LinkedList<>();
        List b = a; // List a = new LinkedList();
        b.add(x);
        return a.iterator().next(); // return (String) a.iterator().next();
    }

    /*public static String method2(List<String> l){
        return null;
    }*/

    public static String method2(List<Integer> l){
        return null;
    }
}
