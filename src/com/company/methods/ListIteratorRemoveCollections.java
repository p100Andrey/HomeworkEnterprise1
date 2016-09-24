package com.company.methods;

import com.company.main.CountAlgorithm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorRemoveCollections {
    CountAlgorithm countAlgorithm = new CountAlgorithm();

    ArrayList<Integer> arrayList = new ArrayList<>();
    LinkedList<Integer> linkedList = new LinkedList<>();
    ListIterator<Integer> listIteratorOfArrayList;
    ListIterator<Integer> listIteratorOfLinkedList;
    ArrayList<Integer> tempArrayList;
    LinkedList<Integer> tempLinkedList;

    public boolean putToCollectionsListIteratorRemove() {
        for (int i = 0; i < countAlgorithm.maxIteration; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }
        return true;
    }

    public boolean listIteratorRemoveToList() {
        for (int j = 0; j < 10; j++) {
            tempArrayList = new ArrayList<>();
            tempArrayList.addAll(arrayList);
            timeMeasureListIteratorRemove(tempArrayList);
        }
        System.out.println("ArrayList (ListIterator.remove method):");
        countAlgorithm.writeTime();

        for (int j = 0; j < 10; j++) {
            tempLinkedList = new LinkedList<>();
            tempLinkedList.addAll(linkedList);
            timeMeasureListIteratorRemove(tempLinkedList);
        }
        System.out.println("LinkedLis (ListIterator.remove method:");
        countAlgorithm.writeTime();

        return true;
    }

    private void timeMeasureListIteratorRemove(Collection<Integer> enyCollection) {
        countAlgorithm = new CountAlgorithm();
        for (int i = 0; i < countAlgorithm.maxIteration; i++) {
            countAlgorithm.timeCount(i);
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
