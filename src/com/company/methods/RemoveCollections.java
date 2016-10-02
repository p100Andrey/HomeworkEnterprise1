package com.company.methods;

import com.company.main.Counter;

import java.util.*;

public class RemoveCollections {
    Counter counter = new Counter();

    ArrayList<Integer> arrayList = new ArrayList<>();
    LinkedList<Integer> linkedList = new LinkedList<>();
    HashSet<Integer> hashSet = new HashSet<>();
    TreeSet<Integer> treeSet = new TreeSet<>();

    public boolean putToCollectionsRemove() {
        for (int i = 0; i < Counter.MAX_ITERATION; i++) {
            arrayList.add(i);
            linkedList.add(i);
            hashSet.add(i);
            treeSet.add(i);
        }
        return true;
    }

    public boolean removeToCollections() {
        for (int j = 0; j < Counter.ITERATIONS_NUMBER; j++) {
            Collection<Integer> arrayList = new ArrayList<>();
            timeMeasureRemove(arrayList);
        }
        System.out.println("ArrayList (remove method):");
        counter.writeTime();

        for (int j = 0; j < Counter.ITERATIONS_NUMBER; j++) {
            Collection<Integer> linkedList = new LinkedList<>();
            timeMeasureRemove(linkedList);
        }
        System.out.println("LinkedList (remove method):");
        counter.writeTime();

        for (int j = 0; j < Counter.ITERATIONS_NUMBER; j++) {
            Collection<Integer> hashSet = new HashSet<>();
            timeMeasureRemove(hashSet);
        }
        System.out.println("HashSet (remove method):");
        counter.writeTime();

        for (int j = 0; j < Counter.ITERATIONS_NUMBER; j++) {
            Collection<Integer> treeSet = new TreeSet<>();
            timeMeasureRemove(treeSet);
        }
        System.out.println("TreeSet (remove method):");
        counter.writeTime();

        return true;
    }

    private void timeMeasureRemove(Collection<Integer> enyCollection) {
        counter = new Counter();
        for (int i = 0; i < Counter.MAX_ITERATION; i++) {
            counter.timeCount(i);
            enyCollection.remove(enyCollection.size() / 2);
        }
    }
}
