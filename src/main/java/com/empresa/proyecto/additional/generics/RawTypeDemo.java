package com.empresa.proyecto.additional.generics;

import java.util.List;

public class RawTypeDemo {
    public static void main(String[] args) {
        Box2<Integer> genBox = new Box2<>(List.of(1, 2, 3));
        for(Integer val: genBox.getA()){
            System.out.println(val);
        }

        // Raw-type
        Box2 rawBox = new Box2(List.of(1, 2, "BasicsString"));
        for(Object val: rawBox.getA()){
            System.out.println(val);
        }
    }
}

class Box2<T> {
    private List<T> a;
    public Box2(List<T> a) {
        this.a = a;
    }
    public List<T> getA() {
        return a;
    }
}
