package com.empresa.proyecto.concurrentcollection;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    static List<String> list = new CopyOnWriteArrayList<>();

    public static void main(String[] args) {
        list.add("John");
        list.add("Rohn");
        list.add("Harry");
        list.add("Potter");
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            String name = (String) itr.next();
            if (name.equals("Harry")) {
                itr.remove();
            }
        }
        System.out.println(list);
    }
}
