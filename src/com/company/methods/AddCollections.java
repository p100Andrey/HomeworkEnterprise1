package com.company.methods;

import com.company.main.Counter;

import java.util.*;

public class AddCollections {
    Counter counter;
    Collection<Integer> arrayList;
    Collection<Integer> linkedList;
    Collection<Integer> hashSet;
    Collection<Integer> treeSet;

    public boolean addToCollections() {
        for (int j = 0; j < Counter.ITERATIONS_NUMBER; j++) {
            arrayList = new ArrayList<>();
            timeMeasureAdd(arrayList);
        }
        System.out.println("ArrayList (add method):");
        counter.writeTime();

        for (int j = 0; j < Counter.ITERATIONS_NUMBER; j++) {
            linkedList = new LinkedList<>();
            timeMeasureAdd(linkedList);
        }
        System.out.println("LinkedList (add method):");
        counter.writeTime();

        for (int j = 0; j < Counter.ITERATIONS_NUMBER; j++) {
            hashSet = new HashSet<>();
            timeMeasureAdd(hashSet);
        }
        System.out.println("HashSet (add method):");
        counter.writeTime();

        for (int j = 0; j < Counter.ITERATIONS_NUMBER; j++) {
            treeSet = new TreeSet<>();
            timeMeasureAdd(treeSet);
        }
        System.out.println("TreeSet (add method):");
        counter.writeTime();

        return true;
    }

    private void timeMeasureAdd(Collection<Integer> enyCollection){
        counter = new Counter();
        for (int i = 0; i < Counter.MAX_ITERATION; i++) {
            counter.timeCount(i);
            enyCollection.add(i);
        }
    }
}
