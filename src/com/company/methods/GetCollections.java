package com.company.methods;

import com.company.main.Counter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class GetCollections {
    Counter counter = new Counter();

    ArrayList<Integer> arrayList = new ArrayList<>();
    LinkedList<Integer> linkedList = new LinkedList<>();

    public boolean putToCollections() {
        for (int i = 0; i < Counter.MAX_ITERATION; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }
        return true;
    }

    public boolean getToCollections() {
        for (int j = 0; j < Counter.ITERATIONS_NUMBER; j++) {
            timeMeasureGet(arrayList);
        }
        System.out.println("ArrayList (get method):");
        counter.writeTime();

        for (int j = 0; j < Counter.ITERATIONS_NUMBER; j++) {
            timeMeasureGet(linkedList);
        }
        System.out.println("LinkedList (get method):");
        counter.writeTime();

        return true;
    }

    private void timeMeasureGet(Collection<Integer> enyCollection) {
        counter = new Counter();
        for (int i = 0; i < Counter.MAX_ITERATION; i++) {
            counter.timeCount(i);
            if (enyCollection instanceof ArrayList) {
                ((ArrayList) enyCollection).get(i);
            }
            if (enyCollection instanceof LinkedList) {
                ((LinkedList) enyCollection).get(i);
            }
        }
    }
}