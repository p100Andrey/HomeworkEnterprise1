package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class RemoveCollections {
    CountAlgorithm countAlgorithm = new CountAlgorithm();

    ArrayList<Integer> arrayList = new ArrayList<>();
    LinkedList<Integer> linkedList = new LinkedList<>();
    HashSet<Integer> hashSet = new HashSet<>();
    TreeSet<Integer> treeSet = new TreeSet<>();

    public void putToCollectionsRemove() {
        for (int i = 0; i < countAlgorithm.maxIteration; i++) {
            arrayList.add(i);
            linkedList.add(i);
            hashSet.add(i);
            treeSet.add(i);
        }
    }

    public void removeArrayList() {
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 100; i++) {
                countAlgorithm.timeCount(i);
                arrayList.remove(arrayList.size() / 2);
            }
        }
        System.out.println("ArrayList (remove method):");
        countAlgorithm.writrTime();
    }

    public void removeLinkedList() {
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 100; i++) {
                countAlgorithm.timeCount(i);
                linkedList.remove(linkedList.size() / 2);
            }
        }
        System.out.println("LinkedList (remove method):");
        countAlgorithm.writrTime();
    }

    public void removeHashSet() {
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 100; i++) {
                countAlgorithm.timeCount(i);
                hashSet.remove(hashSet.size() / 2);
            }
        }
        System.out.println("HashSet (remove method):");
        countAlgorithm.writrTime();
    }

    public void removeTreeSet() {
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 100; i++) {
                countAlgorithm.timeCount(i);
                treeSet.remove(treeSet.size() / 2);
            }
        }
        System.out.println("TreeSet (remove method):");
        countAlgorithm.writrTime();
    }
}
