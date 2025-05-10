package com.empresa.proyecto.List;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class CursorEnumDemo {
    public static void main(String[] args) {
        Vector v = new Vector();
        System.out.println("Enter the elements: ");

        for (int i = 0; i <= 4; i++) {
            Scanner s = new Scanner(System.in);
            Integer data = s.nextInt();
            v.add(data);
        }

        System.out.println(v);

        Enumeration e = v.elements();
        while (e.hasMoreElements()) {
            Integer element = (Integer) e.nextElement();
            if (element % 3 == 0) {
                System.out.println(element);
            }
        }
    }
}
