package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class AddCollections {
    private int maxIteration = 1024000;
    private int startElement = 600000;
    private long iterations10K = 2560;
    private long iterations100K = 25600;
    private long iterations1000K = 256000;

    public void addArrayList() {
        long startTime = 0;
        long finishTime10K = 0;
        long finishTime100K = 0;
        long finishTime1000K = 0;
        for (int j = 0; j < 10; j++) {
            ArrayList<Integer> arrayList = new ArrayList<>();
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
                arrayList.add(i);
            }
        }
        System.out.println("ArrayList:");
        System.out.println("The mean value time 10K = " + finishTime10K);
        System.out.println("The mean value time 100K = " + finishTime100K);
        System.out.println("The mean value time 1000K = " + finishTime1000K);
    }

    public void addLinkedList() {
        long startTime = 0;
        long finishTime10K = 0;
        long finishTime100K = 0;
        long finishTime1000K = 0;
        for (int j = 0; j < 10; j++) {
            LinkedList<Integer> linkedList = new LinkedList<>();
            for (int i = 0; i < maxIteration; i++) {
                if (i == startElement) {
                    startTime = System.nanoTime();
                }
                if (i == startElement + iterations10K) {
                    finishTime10K = System.nanoTime() - startTime;
                }
                if (i == startElement + iterations100K) {
                    finishTime100K = System.nanoTime() - startTime;
                }
                if (i == startElement + iterations1000K) {
                    finishTime1000K = System.nanoTime() - startTime;
                }
                linkedList.add(i);
            }
        }
        System.out.println("LinkedList:");
        System.out.println("The mean value time 10K = " + finishTime10K / 100);
        System.out.println("The mean value time 100K = " + finishTime100K / 100);
        System.out.println("The mean value time 1000K = " + finishTime1000K / 100);
    }

    public void addHashSet() {
        long startTime = 0;
        long finishTime10K = 0;
        long finishTime100K = 0;
        long finishTime1000K = 0;
        for (int j = 0; j < 10; j++) {
            HashSet<Integer> hashSet = new HashSet<>();
            for (int i = 0; i < maxIteration; i++) {
                if (i == startElement) {
                    startTime = System.nanoTime();
                }
                if (i == startElement + iterations10K) {
                    finishTime10K = System.nanoTime() - startTime;
                }
                if (i == startElement + iterations100K) {
                    finishTime100K = System.nanoTime() - startTime;
                }
                if (i == startElement + iterations1000K) {
                    finishTime1000K = System.nanoTime() - startTime;
                }
                hashSet.add(i);
            }
        }
        System.out.println("HashSet:");
        System.out.println("The mean value time 10K = " + finishTime10K / 100);
        System.out.println("The mean value time 100K = " + finishTime100K / 100);
        System.out.println("The mean value time 1000K = " + finishTime1000K / 100);
    }

    public void addTreeSet() {
        long startTime = 0;
        long finishTime10K = 0;
        long finishTime100K = 0;
        long finishTime1000K = 0;
        for (int j = 0; j < 10; j++) {
            TreeSet<Integer> treeSet = new TreeSet<>();
            for (int i = 0; i < maxIteration; i++) {
                if (i == startElement) {
                    startTime = System.nanoTime();
                }
                if (i == startElement + iterations10K) {
                    finishTime10K = System.nanoTime() - startTime;
                }
                if (i == startElement + iterations100K) {
                    finishTime100K = System.nanoTime() - startTime;
                }
                if (i == startElement + iterations1000K) {
                    finishTime1000K = System.nanoTime() - startTime;
                }
                treeSet.add(i);
            }
        }
        System.out.println("TreeSet:");
        System.out.println("The mean value time 10K = " + finishTime10K / 100);
        System.out.println("The mean value time 100K = " + finishTime100K / 100);
        System.out.println("The mean value time 1000K = " + finishTime1000K / 100);
    }
}
