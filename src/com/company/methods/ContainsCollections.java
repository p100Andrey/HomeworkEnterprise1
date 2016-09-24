package com.company.methods;

import com.company.main.CountAlgorithm;

import java.util.*;

public class ContainsCollections {
    CountAlgorithm countAlgorithm = new CountAlgorithm();

    ArrayList<Integer> arrayList = new ArrayList<>();
    LinkedList<Integer> linkedList = new LinkedList<>();
    HashSet<Integer> hashSet = new HashSet<>();
    TreeSet<Integer> treeSet = new TreeSet<>();

    public boolean putToCollectionsContains() {
        for (int i = 0; i < countAlgorithm.maxIteration; i++) {
            arrayList.add(i);
            linkedList.add(i);
            hashSet.add(i);
            treeSet.add(i);
        }
        return true;
    }

    public boolean containsInCollections() {
        for (int j = 0; j < 10; j++) {
            timeMeasureContains(arrayList);
        }
        System.out.println("ArrayList (contains method):");
        countAlgorithm.writeTime();

        for (int j = 0; j < 10; j++) {
            timeMeasureContains(linkedList);
        }
        System.out.println("LinkedList (contains method):");
        countAlgorithm.writeTime();

        for (int j = 0; j < 10; j++) {
            timeMeasureContains(hashSet);
        }
        System.out.println("HashSet (contains method):");
        countAlgorithm.writeTime();

        for (int j = 0; j < 10; j++) {
            timeMeasureContains(treeSet);
        }
        System.out.println("TreeSet (contains method):");
        countAlgorithm.writeTime();

        return true;
    }

    private void timeMeasureContains(Collection<Integer> enyCollection) {
        countAlgorithm = new CountAlgorithm();
        for (int i = 0; i < countAlgorithm.maxIteration; i++) {
            countAlgorithm.timeCount(i);
            boolean tempEnyCollection = enyCollection.contains(i);
        }
    }
}
