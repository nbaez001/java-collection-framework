package com.empresa.proyecto.additional.generics;

public class LinkedListDemo {
    public static void main(String[] args) {
        DataNode<Integer> node2 = new DataNode<>(20, null);
        DataNode<Number> node111 = new DataNode<>(35.8, null);
        node111.setNext(node2);
        System.out.println(node111);
    }
}

class DataNode<E> {
    private E data;
    private DataNode<? extends Number> next;

    public DataNode(E data, DataNode<? extends Number> next) {
        this.data = data;
        this.next = next;
    }
    public E getData() {
        return data;
    }
    public void setData(E data) {
        this.data = data;
    }
    public DataNode<? extends Number> getNext() {
        return next;
    }
    public void setNext(DataNode<? extends Number> next) {
        this.next = next;
    }
    @Override
    public String toString() {
        return "DataNode{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
