package com.company.methods;

import com.company.main.CountAlgorithm;

import java.util.*;

public class AddCollections {
    CountAlgorithm countAlgorithm;

    public boolean addToCollections() {
        for (int j = 0; j < 10; j++) {
            Collection<Integer> arrayList = new ArrayList<>();
            timeMeasureAdd(arrayList);
        }
        System.out.println("ArrayList (add method):");
        countAlgorithm.writeTime();

        for (int j = 0; j < 10; j++) {
            Collection<Integer> linkedList = new LinkedList<>();
            timeMeasureAdd(linkedList);
        }
        System.out.println("LinkedList (add method):");
        countAlgorithm.writeTime();

        for (int j = 0; j < 10; j++) {
            Collection<Integer> hashSet = new HashSet<>();
            timeMeasureAdd(hashSet);
        }
        System.out.println("HashSet (add method):");
        countAlgorithm.writeTime();

        for (int j = 0; j < 10; j++) {
            Collection<Integer> treeSet = new TreeSet<>();
            timeMeasureAdd(treeSet);
        }
        System.out.println("TreeSet (add method):");
        countAlgorithm.writeTime();

        return true;
    }

    private void timeMeasureAdd(Collection<Integer> enyCollection){
        countAlgorithm = new CountAlgorithm();
        for (int i = 0; i < countAlgorithm.maxIteration; i++) {
            countAlgorithm.timeCount(i);
            enyCollection.add(i);
        }
    }
}
