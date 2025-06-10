package com.empresa.proyecto.curso1.map;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapDemo {
    public static void main(String[] args) {
        NavigableMap<String, Integer> t = new TreeMap<>();
        t.put("A", 123);
        t.put("B", 456);
        t.put("C", 789);
        t.put("D", 546);
        t.put("E", 776);
        t.put("F", 775);
        t.put("G", 987);
        t.put("H", 544);
        t.put("I", 543);

        System.out.println(t);

        System.out.println("** METHODS **");
        System.out.println(t.ceilingEntry("C"));
        // C=789
        System.out.println(t.floorKey("E"));
        // E
        System.out.println(t.higherKey("A"));
        // B
        System.out.println(t.lowerKey("E"));
        // D
        System.out.println(t.ceilingKey("F"));
        // F
        System.out.println(t.descendingKeySet());
        // [I, H, G, F, E, D, C, B, A]
        System.out.println(t.descendingMap());
        // {I=543, H=544, G=987, F=775, E=776, D=546, C=789, B=456, A=123}
        System.out.println(t.headMap("G"));
        // {A=123, B=456, C=789, D=546, E=776, F=775}
        System.out.println(t.headMap("G", true));
        // {A=123, B=456, C=789, D=546, E=776, F=775, G=987}
        System.out.println(t.subMap("A","E"));
        // {A=123, B=456, C=789, D=546}
        System.out.println(t.subMap("A",true, "E", false));
        // {A=123, B=456, C=789, D=546}
        System.out.println(t.tailMap("G"));
        // {G=987, H=544, I=543}
        System.out.println(t.tailMap("E", false));
        // {F=775, G=987, H=544, I=543}
        System.out.println(t.higherKey("H"));
        // I
        System.out.println(t.navigableKeySet());
        // [A, B, C, D, E, F, G, H, I]
    }
}
