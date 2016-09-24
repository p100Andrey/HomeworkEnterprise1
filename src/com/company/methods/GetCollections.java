package com.company.methods;

import com.company.main.CountAlgorithm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class GetCollections {
    CountAlgorithm countAlgorithm = new CountAlgorithm();

    ArrayList<Integer> arrayList = new ArrayList<>();
    LinkedList<Integer> linkedList = new LinkedList<>();

    public boolean putToCollections() {
        for (int i = 0; i < countAlgorithm.maxIteration; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }
        return true;
    }

    public boolean getToCollections() {
        for (int j = 0; j < 10; j++) {
            timeMeasureGet(arrayList);
        }
        System.out.println("ArrayList (get method):");
        countAlgorithm.writeTime();

        for (int j = 0; j < 10; j++) {
            timeMeasureGet(linkedList);
        }
        System.out.println("LinkedList (get method):");
        countAlgorithm.writeTime();

        return true;
    }

    private void timeMeasureGet(Collection<Integer> enyCollection) {
        countAlgorithm = new CountAlgorithm();
        for (int i = 0; i < countAlgorithm.maxIteration; i++) {
            countAlgorithm.timeCount(i);
            if (enyCollection instanceof ArrayList) {
                int tempEnyCollection = (int) ((ArrayList) enyCollection).get(i);
            }
            if (enyCollection instanceof LinkedList) {
                int tempEnyCollection = (int) ((LinkedList) enyCollection).get(i);
            }
        }
    }
}