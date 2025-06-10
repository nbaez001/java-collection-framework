package com.empresa.proyecto.curso1.additional.generics;

import java.util.Arrays;
import java.util.List;

class DataSorter<T extends Number> {
    private List<T> list;

    public DataSorter(List<T> list) {
        this.list = list;
    }

    public void getSortedData() {
        list.sort(null);
        for (T t : list) {
            System.out.println(t);
        }
    }
}

public class BoundedT {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(new Integer[]{2, 5, 8, 9});
        List<Double> slist = Arrays.asList(new Double[]{2.3, 5.6, 13.8});
        DataSorter<Integer> sorter1 = new DataSorter<>(list);
        DataSorter<Double> sorter2 = new DataSorter<>(slist);
        sorter1.getSortedData();
        sorter2.getSortedData();

        getSortedData(list);

        CBound b = new CBound();
        getSortedData2(b);
    }

    public static <T extends Number> void getSortedData(List<T> list){
        list.sort(null);
        for (T t : list) {
            System.out.println(t);
        }
    }

    public static <T extends IBound1 & IBound2> void getSortedData2(T list){

    }
}

interface IBound1 { }
interface IBound2 { }
class CBound implements IBound1, IBound2 { }