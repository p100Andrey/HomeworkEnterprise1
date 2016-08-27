package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class ContainsCollections {
    CountAlgorithm countAlgorithm = new CountAlgorithm();

    ArrayList<Integer> arrayList = new ArrayList<>();
    LinkedList<Integer> linkedList = new LinkedList<>();
    HashSet<Integer> hashSet = new HashSet<>();
    TreeSet<Integer> treeSet = new TreeSet<>();

    public void putToCollectionsContains() {
        for (int i = 0; i < countAlgorithm.maxIteration; i++) {
            arrayList.add(i);
            linkedList.add(i);
            hashSet.add(i);
            treeSet.add(i);
        }
    }

    public void containsArrayList() {
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 10000; i++) {
                countAlgorithm.timeCount(i);
                boolean temp = arrayList.contains(i);
            }
        }
        System.out.println("ArrayList (contains method):");
        countAlgorithm.writrTime();
    }

    public void containsLinkedList() {
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 10000; i++) {
                countAlgorithm.timeCount(i);
                boolean temp = linkedList.contains(i);
            }
        }
        System.out.println("LinkedList (contains method):");
        countAlgorithm.writrTime();
    }

    public void containsHashSet() {
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 10000; i++) {
                countAlgorithm.timeCount(i);
                boolean temp = hashSet.contains(i);
            }
        }
        System.out.println("HashSet (contains method):");
        countAlgorithm.writrTime();
    }

    public void containsTreeSet() {
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 10000; i++) {
                countAlgorithm.timeCount(i);
                boolean temp = treeSet.contains(i);
            }
        }
        System.out.println("TreeSet (contains method):");
        countAlgorithm.writrTime();
    }
}
