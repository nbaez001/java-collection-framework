package com.empresa.proyecto.curso1.additional.generics;

import java.util.ArrayList;
import java.util.List;

public class CollectionDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("John");
        list.add("Carlos");
        for(String object : list){
            String str =  object;
            System.out.println(str);
        }
    }
}
