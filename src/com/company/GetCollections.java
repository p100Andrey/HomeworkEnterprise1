package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class GetCollections {
    ArrayList<Integer> arrayList = new ArrayList<>();
    LinkedList<Integer> linkedList = new LinkedList<>();
    HashSet<Integer> hashSet = new HashSet<>();
    TreeSet<Integer> treeSet = new TreeSet<>();
    private int maxIteration = 1024000;
    private int startElement = 600000;
    private long iterations10K = 2560;
    private long iterations100K = 25600;
    private long iterations1000K = 256000;

    public void putToCollections() {
        for (int i = 0; i < maxIteration; i++) {
            arrayList.add(i);
            linkedList.add(i);
            hashSet.add(i);
            treeSet.add(i);
        }
    }

    public void getArrayList() {
        long startTime = 0;
        long finishTime10K = 0;
        long finishTime100K = 0;
        long finishTime1000K = 0;
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < maxIteration; i++) {
                if (i == startElement) {
                    startTime = System.nanoTime();
                }
                if (i == startElement + iterations10K) {
                    long tempFinishTime10K = System.nanoTime() - startTime;
                    if (i != 0) {
                        finishTime10K = (finishTime10K + tempFinishTime10K) / 2;
                    } else {
                        finishTime10K = tempFinishTime10K;
                    }
                }
                if (i == startElement + iterations100K) {
                    long tempFinishTime100K = System.nanoTime() - startTime;
                    if (i != 0) {
                        finishTime100K = (finishTime100K + tempFinishTime100K) / 2;
                    } else {
                        finishTime100K = tempFinishTime100K;
                    }
                }
                if (i == startElement + iterations1000K) {
                    long tempFinishTime1000K = System.nanoTime() - startTime;
                    if (i != 0) {
                        finishTime1000K = (finishTime1000K + tempFinishTime1000K) / 2;
                    } else {
                        finishTime1000K = tempFinishTime1000K;
                    }
                }
                int tempArrayList = arrayList.get(i);
            }
        }
        System.out.println("ArrayList:");
        System.out.println("Time get10K = " + (finishTime10K / 100));
        System.out.println("Time get100K = " + (finishTime100K / 100));
        System.out.println("Time get1000K = " + (finishTime1000K / 100));
    }

    public void getLinkedList() {
        long startTime = 0;
        long finishTime10K = 0;
        long finishTime100K = 0;
        long finishTime1000K = 0;
        for (int j = 0; j < 10; j++) {
            startElement = 0;
            for (int i = 0; i < 3000; i++) {
                if (i == startElement) {
                    startTime = System.nanoTime();
                }
                if (i == startElement + iterations10K) {
                    long tempFinishTime10K = System.nanoTime() - startTime;
                    if (i != 0) {
                        finishTime10K = (finishTime10K + tempFinishTime10K) / 2;
                    } else {
                        finishTime10K = tempFinishTime10K;
                    }
                }
//                if (i == startElement + iterations100K) {
//                    long tempFinishTime100K = System.nanoTime() - startTime;
//                    if (i != 0) {
//                        finishTime100K = (finishTime100K + tempFinishTime100K) / 2;
//                    } else {
//                        finishTime100K = tempFinishTime100K;
//                    }
//                }
//                if (i == startElement + iterations1000K) {
//                    long tempFinishTime1000K = System.nanoTime() - startTime;
//                    if (i != 0) {
//                        finishTime1000K = (finishTime1000K + tempFinishTime1000K) / 2;
//                    } else {
//                        finishTime1000K = tempFinishTime1000K;
//                    }
//                }
                int tempLinkedList = linkedList.get(i);
            }
        }
        System.out.println("LinkedList:");
        System.out.println("Time get10K = " + (finishTime10K));
//        System.out.println("Time get100K = " + (finishTime100K));
//        System.out.println("Time get1000K = " + (finishTime1000K));
    }
}
