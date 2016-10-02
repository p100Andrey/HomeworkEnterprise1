package com.company.methods;

import com.company.main.Counter;

import java.util.*;

public class PopulateCollections {
    Random rand = new Random();
    Counter counter = new Counter();
    Collection<Integer> arrayList;
    Collection<Integer> linkedList;
    Collection<Integer> hashSet;
    Collection<Integer> treeSet;

    public boolean randomAddCollections() {
        for (int j = 0; j < Counter.ITERATIONS_NUMBER; j++) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            timeMeasureRandomAdd(arrayList);
        }
        System.out.println("ArrayList (populate(randomAdd) method):");
        counter.writeTime();

        for (int j = 0; j < Counter.ITERATIONS_NUMBER; j++) {
            LinkedList<Integer> linkedList = new LinkedList<>();
            timeMeasureRandomAdd(linkedList);
        }
        System.out.println("LinkedList (populate(randomAdd) method):");
        counter.writeTime();

        for (int j = 0; j < Counter.ITERATIONS_NUMBER; j++) {
            HashSet<Integer> hashSet = new HashSet<>();
            timeMeasureRandomAdd(hashSet);
        }
        System.out.println("HashSet (populate(randomAdd) method):");
        counter.writeTime();

        for (int j = 0; j < Counter.ITERATIONS_NUMBER; j++) {
            TreeSet<Integer> treeSet = new TreeSet<>();
            timeMeasureRandomAdd(treeSet);
        }
        System.out.println("TreeSet (populate(randomAdd) method):");
        counter.writeTime();

        return true;
    }

    private void timeMeasureRandomAdd (Collection<Integer> enyCollection){
        for (int i = 0; i < Counter.MAX_ITERATION; i++) {
            counter.timeCount(i);
            enyCollection.add(new Integer(rand.nextInt(Counter.MAX_ITERATION)));
        }
    }
}
