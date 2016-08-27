package com.company;

import java.util.*;

public class PopulateCollections {
    Random rand = new Random();
    CountAlgorithm countAlgorithm = new CountAlgorithm();

    public void randomAddArrayList() {
        for (int j = 0; j < 10; j++) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i = 0; i < countAlgorithm.maxIteration; i++) {
                countAlgorithm.timeCount(i);
                arrayList.add(new Integer(rand.nextInt(100)));
            }
        }
        System.out.println("ArrayList (populate(randomAdd) method):");
        countAlgorithm.writrTime();
    }

    public void randomAddLinkedList() {
        for (int j = 0; j < 10; j++) {
            LinkedList<Integer> linkedList = new LinkedList<>();
            for (int i = 0; i < countAlgorithm.maxIteration; i++) {
                countAlgorithm.timeCount(i);
                linkedList.add(new Integer(rand.nextInt(100)));
            }
        }
        System.out.println("LinkedList (populate(randomAdd) method):");
        countAlgorithm.writrTime();
    }

    public void randomAddHashSet() {
        for (int j = 0; j < 10; j++) {
            HashSet<Integer> hashSet = new HashSet<>();
            for (int i = 0; i < countAlgorithm.maxIteration; i++) {
                countAlgorithm.timeCount(i);
                hashSet.add(new Integer(rand.nextInt(100)));
            }
        }
        System.out.println("HashSet (populate(randomAdd) method):");
        countAlgorithm.writrTime();
    }

    public void randomAddTreeSet() {
        for (int j = 0; j < 10; j++) {
            TreeSet<Integer> treeSet = new TreeSet<>();
            for (int i = 0; i < countAlgorithm.maxIteration; i++) {
                countAlgorithm.timeCount(i);
                treeSet.add(new Integer(rand.nextInt(100)));
            }
        }
        System.out.println("TreeSet (populate(randomAdd) method):");
        countAlgorithm.writrTime();
    }
}
