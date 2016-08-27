package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class AddCollections {
    CountAlgorithm countAlgorithm = new CountAlgorithm();

    public void addArrayList() {
        for (int j = 0; j < 10; j++) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i = 0; i < countAlgorithm.maxIteration; i++) {
                countAlgorithm.timeCount(i);
                arrayList.add(i);
            }
        }
        System.out.println("ArrayList (add method):");
        countAlgorithm.writrTime();
    }

    public void addLinkedList() {
        for (int j = 0; j < 10; j++) {
            LinkedList<Integer> linkedList = new LinkedList<>();
            for (int i = 0; i < countAlgorithm.maxIteration; i++) {
                countAlgorithm.timeCount(i);
                linkedList.add(i);
            }
        }
        System.out.println("LinkedList (add method):");
        countAlgorithm.writrTime();
    }

    public void addHashSet() {
        for (int j = 0; j < 10; j++) {
            HashSet<Integer> hashSet = new HashSet<>();
            for (int i = 0; i < countAlgorithm.maxIteration; i++) {
                countAlgorithm.timeCount(i);
                hashSet.add(i);
            }
        }
        System.out.println("HashSet (add method):");
        countAlgorithm.writrTime();
    }

    public void addTreeSet() {
        for (int j = 0; j < 10; j++) {
            TreeSet<Integer> treeSet = new TreeSet<>();
            for (int i = 0; i < countAlgorithm.maxIteration; i++) {
                countAlgorithm.timeCount(i);
                treeSet.add(i);
            }
        }
        System.out.println("TreeSet (add method):");
        countAlgorithm.writrTime();
    }
}
