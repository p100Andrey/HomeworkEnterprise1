package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorRemoveCollections {
    CountAlgorithm countAlgorithm = new CountAlgorithm();

    ArrayList<Integer> arrayList = new ArrayList<>();
    LinkedList<Integer> linkedList = new LinkedList<>();
    ListIterator<Integer> listIteratorOfArrayList;
    ListIterator<Integer> listIteratorOfLinkedList;

    public void putToCollectionsListIteratorRemove() {
        for (int i = 0; i < countAlgorithm.maxIteration; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }
        listIteratorOfArrayList = arrayList.listIterator();
        listIteratorOfLinkedList = linkedList.listIterator();
    }

    public void listIteratorRemoveToArrayList() {
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 1000; i++) {
                countAlgorithm.timeCount(i);
                listIteratorOfArrayList.next();
                listIteratorOfArrayList.remove();
            }
        }
        System.out.println("ArrayList (ListIterator.remove method):");
        countAlgorithm.writrTime();
    }

    public void listIteratorRemoveToLinkedList() {
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 1000; i++) {
                countAlgorithm.timeCount(i);
                listIteratorOfLinkedList.next();
                listIteratorOfLinkedList.remove();
            }
        }
        System.out.println("LinkedLis (ListIterator.remove method:");
        countAlgorithm.writrTime();
    }

}
