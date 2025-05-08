package com.empresa.proyecto.List;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector v = new Vector(); // It will create a Vector of size 10
        Vector vec = new Vector(60);

        Vector vec1 = new Vector(100, 10);
        //Vector vec2 = new Vector(Collection c);

        v.add(10); // Add method from Collection interface
        v.addElement("Hello"); // Add method from the legacy class
        System.out.println(v);
        v.remove(0);
        System.out.println(v);
        System.out.println(v.elementAt(0));

        System.out.println(v.firstElement());
        System.out.println(v.lastElement());
        System.out.println(v.get(0));

        System.out.println(v.size());
        System.out.println(v.capacity());
    }
}
