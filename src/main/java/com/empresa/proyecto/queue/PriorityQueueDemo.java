package com.empresa.proyecto.queue;

import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue(); // def capacity = 11, DNSO (Default Natural Sorting Order)
        PriorityQueue pq2 = new PriorityQueue(20); // capacity 20
        //PriorityQueue pq3 = new PriorityQueue(int initialCapacity, Comparator c);
        SortedSet s = new TreeSet();
        PriorityQueue pq4 = new PriorityQueue(s); // Creates an equivalent priority queue of the SortedSet
        List l = new ArrayList<>();
        PriorityQueue pq5 = new PriorityQueue(l);
    }
}
