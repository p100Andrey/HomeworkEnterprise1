package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class GetCollections {
    CountAlgorithm countAlgorithm = new CountAlgorithm();

    ArrayList<Integer> arrayList = new ArrayList<>();
    LinkedList<Integer> linkedList = new LinkedList<>();

    public void putToCollections() {
        for (int i = 0; i < countAlgorithm.maxIteration; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }
    }

    public void getArrayList() {
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < countAlgorithm.maxIteration; i++) {
                countAlgorithm.timeCount(i);
                int tempLinkedList = arrayList.get(i);
            }
        }
        System.out.println("ArrayList (get method):");
        countAlgorithm.writrTime();
    }

    public void getLinkedList() {
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 10000; i++) {
                countAlgorithm.timeCount(i);
                int tempLinkedList = linkedList.get(i);
            }
        }
        System.out.println("LinkedList (get method):");
        countAlgorithm.writrTime();
    }
}