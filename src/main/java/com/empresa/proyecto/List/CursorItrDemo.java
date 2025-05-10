package com.empresa.proyecto.List;

import java.util.ArrayList;
import java.util.Iterator;

public class CursorItrDemo {
    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<>();
        data.add(12);
        data.add(23);
        data.add(36);

        Iterator iterator = data.iterator();
        while (iterator.hasNext()) {
            Integer i = (Integer) iterator.next();
            if (i % 3 == 0)
                System.out.println(i);
            else
                iterator.remove();
        }
        System.out.println(data);
    }
}
