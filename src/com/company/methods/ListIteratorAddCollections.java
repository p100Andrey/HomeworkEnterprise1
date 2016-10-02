package com.company.methods;

import com.company.main.Counter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorAddCollections {
    Counter counter = new Counter();

    ArrayList<Integer> arrayList = new ArrayList<>();
    LinkedList<Integer> linkedList = new LinkedList<>();
    ListIterator<Integer> listIteratorOfArrayList;
    ListIterator<Integer> listIteratorOfLinkedList;


    public boolean putToCollectionsListIteratorAdd() {
        for (int i = 0; i < Counter.MAX_ITERATION; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }
        return true;
    }

    public boolean listIteratorAddToLists() {
        for (int j = 0; j < Counter.ITERATIONS_NUMBER; j++) {
            timeMeasureListIteratorAdd(arrayList);
        }
        System.out.println("ArrayList (ListIterator.add method):");
        counter.writeTime();

        for (int j = 0; j < Counter.ITERATIONS_NUMBER; j++) {
            timeMeasureListIteratorAdd(linkedList);
        }
        System.out.println("LinkedLis (ListIterator.add method):");
        counter.writeTime();

        return true;
    }

    private void timeMeasureListIteratorAdd(Collection<Integer> enyCollection) {
        counter = new Counter();
        listIteratorOfArrayList = arrayList.listIterator();
        listIteratorOfLinkedList = linkedList.listIterator();
        for (int i = 0; i < Counter.MAX_ITERATION; i++) {
            counter.timeCount(i);
            if (enyCollection instanceof ArrayList) {
                listIteratorOfArrayList.next();
                listIteratorOfArrayList.add(0);
            }
            if (enyCollection instanceof LinkedList) {
                listIteratorOfLinkedList.next();
                listIteratorOfLinkedList.add(0);
            }
        }
    }
}
