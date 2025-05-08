package com.empresa.proyecto.generics;

import java.util.ArrayList;
import java.util.List;

public class DataStructureDemo {
    public static void main(String[] args) {
        String[] strArray = new String[20];
        Employee[] empArray = new Employee[20];
        strArray[0] = "Meenal";

        List l = new ArrayList();
        // int -> Integer
        l.add("Meenal");
        l.add(new Employee());
        Employee name = (Employee) l.get(0);
    }
}
