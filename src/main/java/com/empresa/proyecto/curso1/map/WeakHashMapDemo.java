package com.empresa.proyecto.curso1.map;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapDemo {

    public static void main(String[] args) throws InterruptedException {
        //HashMap
        Map m = new HashMap();
        Temp t = new Temp();
        m.put(t, "element");
        System.out.println(m);

        t = null;
        System.gc();
        Thread.sleep(3000);
        System.out.println(m);

        //WeakHashMap
        Map m2 = new WeakHashMap();
        Temp t2 = new Temp();
        m2.put(t2, "element");
        System.out.println(m2);

        t2 = null;
        System.gc();
        Thread.sleep(3000);
        System.out.println(m2);
    }
}
