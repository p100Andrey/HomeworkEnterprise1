package com.company.methods;

import com.company.main.CountAlgorithm;

import java.util.*;

public class PopulateCollections {
    Random rand = new Random();
    CountAlgorithm countAlgorithm = new CountAlgorithm();

    public boolean randomAddCollections() {
        for (int j = 0; j < 10; j++) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            timeMeasureRandomAdd(arrayList);
        }
        System.out.println("ArrayList (populate(randomAdd) method):");
        countAlgorithm.writeTime();

        for (int j = 0; j < 10; j++) {
            LinkedList<Integer> linkedList = new LinkedList<>();
            timeMeasureRandomAdd(linkedList);
        }
        System.out.println("LinkedList (populate(randomAdd) method):");
        countAlgorithm.writeTime();

        for (int j = 0; j < 10; j++) {
            HashSet<Integer> hashSet = new HashSet<>();
            timeMeasureRandomAdd(hashSet);
        }
        System.out.println("HashSet (populate(randomAdd) method):");
        countAlgorithm.writeTime();

        for (int j = 0; j < 10; j++) {
            TreeSet<Integer> treeSet = new TreeSet<>();
            timeMeasureRandomAdd(treeSet);
        }
        System.out.println("TreeSet (populate(randomAdd) method):");
        countAlgorithm.writeTime();

        return true;
    }

    private void timeMeasureRandomAdd (Collection<Integer> enyCollection){
        for (int i = 0; i < countAlgorithm.maxIteration; i++) {
            countAlgorithm.timeCount(i);
            enyCollection.add(new Integer(rand.nextInt(countAlgorithm.maxIteration)));
        }
    }
}
