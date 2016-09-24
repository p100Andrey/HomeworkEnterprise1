package com.company.methods;

import com.company.main.CountAlgorithm;

import java.util.*;

public class RemoveCollections {
    CountAlgorithm countAlgorithm = new CountAlgorithm();

    ArrayList<Integer> arrayList = new ArrayList<>();
    LinkedList<Integer> linkedList = new LinkedList<>();
    HashSet<Integer> hashSet = new HashSet<>();
    TreeSet<Integer> treeSet = new TreeSet<>();

    public boolean putToCollectionsRemove() {
        for (int i = 0; i < countAlgorithm.maxIteration; i++) {
            arrayList.add(i);
            linkedList.add(i);
            hashSet.add(i);
            treeSet.add(i);
        }
        return true;
    }

    public boolean removeToCollections() {
        for (int j = 0; j < 10; j++) {
            Collection<Integer> arrayList = new ArrayList<>();
            timeMeasureRemove(arrayList);
        }
        System.out.println("ArrayList (remove method):");
        countAlgorithm.writeTime();

        for (int j = 0; j < 10; j++) {
            Collection<Integer> linkedList = new LinkedList<>();
            timeMeasureRemove(linkedList);
        }
        System.out.println("LinkedList (remove method):");
        countAlgorithm.writeTime();

        for (int j = 0; j < 10; j++) {
            Collection<Integer> hashSet = new HashSet<>();
            timeMeasureRemove(hashSet);
        }
        System.out.println("HashSet (remove method):");
        countAlgorithm.writeTime();

        for (int j = 0; j < 10; j++) {
            Collection<Integer> treeSet = new TreeSet<>();
            timeMeasureRemove(treeSet);
        }
        System.out.println("TreeSet (remove method):");
        countAlgorithm.writeTime();

        return true;
    }

    private void timeMeasureRemove(Collection<Integer> enyCollection) {
        countAlgorithm = new CountAlgorithm();
        for (int i = 0; i < countAlgorithm.maxIteration; i++) {
            countAlgorithm.timeCount(i);
            enyCollection.remove(enyCollection.size() / 2);
        }
    }
}
