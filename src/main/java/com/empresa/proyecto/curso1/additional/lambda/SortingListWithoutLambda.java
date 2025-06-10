package com.empresa.proyecto.curso1.additional.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingListWithoutLambda {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(0);
        list.add(3);
        list.add(11);
        System.out.println(list);

        Collections.sort(list, ((o1, o2) -> {
            Integer oo1 = (Integer) o1;
            Integer oo2 = (Integer) o2;
            if (oo1 > oo2) {
                return -1;
            } else if (oo1 < oo2) {
                return 1;
            } else {
                return 0;
            }
        }));
        System.out.println(list);
    }
}