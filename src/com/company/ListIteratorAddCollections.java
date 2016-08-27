package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorAddCollections {
    CountAlgorithm countAlgorithm = new CountAlgorithm();

    ArrayList<Integer> arrayList = new ArrayList<>();
    LinkedList<Integer> linkedList = new LinkedList<>();
    ListIterator<Integer> listIteratorOfArrayList;
    ListIterator<Integer> listIteratorOfLinkedList;


    public void putToCollectionsListIteratorAdd() {
        for (int i = 0; i < countAlgorithm.maxIteration; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }
        listIteratorOfArrayList = arrayList.listIterator();
        listIteratorOfLinkedList = linkedList.listIterator();
    }

    public void listIteratorAddToArrayList() {
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 10000; i++) {
                countAlgorithm.timeCount(i);
                listIteratorOfArrayList.next();
                listIteratorOfArrayList.add(0);
            }
        }
        System.out.println("ArrayList (ListIterator.add method):");
        countAlgorithm.writrTime();
    }

    public void listIteratorAddToLinkedList() {
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 10000; i++) {
                countAlgorithm.timeCount(i);
                listIteratorOfLinkedList.next();
                listIteratorOfLinkedList.add(0);
            }
        }
        System.out.println("LinkedLis (ListIterator.add method):");
        countAlgorithm.writrTime();
    }
}
