package com.company.methods;

import com.company.main.Counter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorRemoveCollections {
    Counter counter = new Counter();

    ArrayList<Integer> arrayList = new ArrayList<>();
    LinkedList<Integer> linkedList = new LinkedList<>();
    ListIterator<Integer> listIteratorOfArrayList;
    ListIterator<Integer> listIteratorOfLinkedList;
    ArrayList<Integer> tempArrayList;
    LinkedList<Integer> tempLinkedList;

    public boolean putToCollectionsListIteratorRemove() {
        for (int i = 0; i < Counter.MAX_ITERATION; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }
        return true;
    }

    public boolean listIteratorRemoveToList() {
        for (int j = 0; j < Counter.ITERATIONS_NUMBER; j++) {
            tempArrayList = new ArrayList<>();
            tempArrayList.addAll(arrayList);
            timeMeasureListIteratorRemove(tempArrayList);
        }
        System.out.println("ArrayList (ListIterator.remove method):");
        counter.writeTime();

        for (int j = 0; j < Counter.ITERATIONS_NUMBER; j++) {
            tempLinkedList = new LinkedList<>();
            tempLinkedList.addAll(linkedList);
            timeMeasureListIteratorRemove(tempLinkedList);
        }
        System.out.println("LinkedLis (ListIterator.remove method:");
        counter.writeTime();

        return true;
    }

    private void timeMeasureListIteratorRemove(Collection<Integer> enyCollection) {
        counter = new Counter();
        for (int i = 0; i < Counter.MAX_ITERATION; i++) {
            counter.timeCount(i);
            if (enyCollection instanceof ArrayList) {
                listIteratorOfArrayList = tempArrayList.listIterator();
                listIteratorOfArrayList.next();
                listIteratorOfArrayList.remove();
            }
            if (enyCollection instanceof LinkedList) {
                listIteratorOfLinkedList = tempLinkedList.listIterator();
                listIteratorOfLinkedList.next();
                listIteratorOfLinkedList.remove();
            }
        }
    }
}
