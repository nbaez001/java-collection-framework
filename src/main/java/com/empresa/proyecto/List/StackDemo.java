package com.empresa.proyecto.List;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack s = new Stack(); // There is only one structure for Stack
        s.push(10); // Pushed an object into the Stack
        s.push(30);
        s.push(true);
        System.out.println(s);
        Object o = s.pop(); // Pop out the top object
        System.out.println(s);
        Object p = s.peek(); // Picks the top objects
        System.out.println(p);
        System.out.println(s);
        System.out.println(s.empty()); // Return true if the Stack is empty
        System.out.println(s.search(10)); // Return the position of the element from up position
    }
}
