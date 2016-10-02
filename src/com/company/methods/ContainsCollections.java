package com.company.methods;

import com.company.main.Counter;

import java.util.*;

public class ContainsCollections {
    Counter counter = new Counter();

    ArrayList<Integer> arrayList = new ArrayList<>();
    LinkedList<Integer> linkedList = new LinkedList<>();
    HashSet<Integer> hashSet = new HashSet<>();
    TreeSet<Integer> treeSet = new TreeSet<>();

    public boolean putToCollectionsContains() {
        for (int i = 0; i < Counter.MAX_ITERATION; i++) {
            arrayList.add(i);
            linkedList.add(i);
            hashSet.add(i);
            treeSet.add(i);
        }
        return true;
    }

    public boolean containsInCollections() {
        for (int j = 0; j < Counter.ITERATIONS_NUMBER; j++) {
            timeMeasureContains(arrayList);
        }
        System.out.println("ArrayList (contains method):");
        counter.writeTime();

        for (int j = 0; j < Counter.ITERATIONS_NUMBER; j++) {
            timeMeasureContains(linkedList);
        }
        System.out.println("LinkedList (contains method):");
        counter.writeTime();

        for (int j = 0; j < Counter.ITERATIONS_NUMBER; j++) {
            timeMeasureContains(hashSet);
        }
        System.out.println("HashSet (contains method):");
        counter.writeTime();

        for (int j = 0; j < Counter.ITERATIONS_NUMBER; j++) {
            timeMeasureContains(treeSet);
        }
        System.out.println("TreeSet (contains method):");
        counter.writeTime();

        return true;
    }

    private void timeMeasureContains(Collection<Integer> enyCollection) {
        counter = new Counter();
        for (int i = 0; i < Counter.MAX_ITERATION; i++) {
            counter.timeCount(i);
            enyCollection.contains(i);
        }
    }
}
