package com.empresa.proyecto.additional.generics;

import java.util.ArrayList;
import java.util.List;

public class Subtyping {
    public static void main(String[] args) {
        Object o = new Object();
        Integer i = Integer.valueOf(11);
        o = i;

        List<Number> list = new ArrayList<>();
        list.add(Integer.valueOf(10));
        list.add(Double.valueOf(10.5));

        List<Box3<Integer>> bList = new ArrayList<>();
        bList.add(new Box3<>(List.of(1,2,3)));
        bList.add(new SquareBox<>(List.of(3,4,6,7,8)));

    }
}

class SquareBox<T> extends Box3<T> {
    public SquareBox(List<T> a) {
        super(a);
    }
}

class Box3<T> {
    private List<T> a;
    public Box3(List<T> a) {
        this.a = a;
    }
    public List<T> getA() {
        return a;
    }
}