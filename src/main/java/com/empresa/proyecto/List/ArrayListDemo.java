package com.empresa.proyecto.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        ArrayList al2 = new ArrayList(30);
        //ArrayList al3 = new ArrayList(Collection c);
        al.add("John");
        al.add(true);
        al.add(10);
        System.out.println(al);
        al.remove(1);
        System.out.println(al);
        al.remove(new Integer(10));
        System.out.println(al);

        System.out.println(al.get(0));
        ArrayList<String> strList = new ArrayList<>();
    }
}
