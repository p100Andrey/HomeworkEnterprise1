package com.company.methods;

import com.company.main.CountAlgorithm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorAddCollections {
    CountAlgorithm countAlgorithm = new CountAlgorithm();

    ArrayList<Integer> arrayList = new ArrayList<>();
    LinkedList<Integer> linkedList = new LinkedList<>();
    ListIterator<Integer> listIteratorOfArrayList;
    ListIterator<Integer> listIteratorOfLinkedList;


    public boolean putToCollectionsListIteratorAdd() {
        for (int i = 0; i < countAlgorithm.maxIteration; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }
        return true;
    }

    public boolean listIteratorAddToLists() {
        for (int j = 0; j < 10; j++) {
            timeMeasureListIteratorAdd(arrayList);
        }
        System.out.println("ArrayList (ListIterator.add method):");
        countAlgorithm.writeTime();

        for (int j = 0; j < 10; j++) {
            timeMeasureListIteratorAdd(linkedList);
        }
        System.out.println("LinkedLis (ListIterator.add method):");
        countAlgorithm.writeTime();

        return true;
    }

    private void timeMeasureListIteratorAdd(Collection<Integer> enyCollection) {
        countAlgorithm = new CountAlgorithm();
        for (int i = 0; i < countAlgorithm.maxIteration; i++) {
            countAlgorithm.timeCount(i);
            if (enyCollection instanceof ArrayList) {
                listIteratorOfArrayList = arrayList.listIterator();
                listIteratorOfArrayList.next();
                listIteratorOfArrayList.add(0);
            }
            if (enyCollection instanceof LinkedList) {
                listIteratorOfLinkedList = linkedList.listIterator();
                listIteratorOfLinkedList.next();
                listIteratorOfLinkedList.add(0);
            }
        }
    }
}
