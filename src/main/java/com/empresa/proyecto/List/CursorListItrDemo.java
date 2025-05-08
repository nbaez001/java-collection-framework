package com.empresa.proyecto.List;

import java.util.ArrayList;
import java.util.ListIterator;

public class CursorListItrDemo {
    public static void main(String[] args) {
        ArrayList<String> data = new ArrayList<>();
        data.add("Raj");
        data.add("Ramesh");
        data.add("Amrish");
        data.add("Jai");
        data.add("Khushal");
        System.out.println(data);

        ListIterator<String> li = data.listIterator();
        while (li.hasNext()) {
            String item = li.next();
            if (item.equals("Jai")) {
                li.add("Viru");
            }
            if (item.equals("Raj")) {
                li.remove();
            }
            if (item.equals("Amrish")) {
                li.set("Amresh");
            }
        }
        System.out.println(data);
    }
}
