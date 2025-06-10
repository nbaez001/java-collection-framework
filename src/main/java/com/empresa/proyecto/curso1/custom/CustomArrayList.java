package com.empresa.proyecto.curso1.custom;

import java.util.AbstractList;
import java.util.Arrays;

public class CustomArrayList<T> extends AbstractList<T> {
    private T[] data;
    private int size = 0;
    private static final int INITIAL_CAPACITY = 10;

    @SuppressWarnings("unchecked")
    public CustomArrayList() {
        data = (T[]) new Object[INITIAL_CAPACITY];
    }

    @Override
    public T get(int index) {
        if (index >= size || index < 0) throw new IndexOutOfBoundsException();
        return data[index];
    }

    @Override
    public T set(int index, T element) {
        if (index >= size || index < 0) throw new IndexOutOfBoundsException();
        T old = data[index];
        data[index] = element;
        return old;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(int index, T element) {
        if (index > size || index < 0) throw new IndexOutOfBoundsException();
        if (size == data.length) resize();
        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = element;
        size++;
    }

    @Override
    public T remove(int index) {
        if (index >= size || index < 0) throw new IndexOutOfBoundsException();
        T removed = data[index];
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[--size] = null;
        return removed;
    }

    private void resize() {
        int newCapacity = data.length * 2;
        data = Arrays.copyOf(data, newCapacity);
    }
}