package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class ContainsCollections {
    ArrayList<Integer> arrayList = new ArrayList<>();
    LinkedList<Integer> linkedList = new LinkedList<>();
    HashSet<Integer> hashSet = new HashSet<>();
    TreeSet<Integer> treeSet = new TreeSet<>();
    private int maxIteration = 1024000;
    private int startElement = 600000;
    private long iterations10K = 2560;
    private long iterations100K = 25600;
    private long iterations1000K = 256000;

    public void putToCollectionsContains() {
        for (int i = 0; i < maxIteration; i++) {
            arrayList.add(i);
            linkedList.add(i);
            hashSet.add(i);
            treeSet.add(i);
        }
    }

    public void containsArrayList() {
        long startTime = 0;
        long finishTime10K = 0;
        long finishTime100K = 0;
        long finishTime1000K = 0;
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 100000; i++) {
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
                boolean temp = arrayList.contains(i);
            }
        }
        System.out.println("ArrayList:");
        outPrintTime(finishTime10K, finishTime100K, finishTime1000K);
    }

    public void containsLinkedList() {
        long startTime = 0;
        long finishTime10K = 0;
        long finishTime100K = 0;
        long finishTime1000K = 0;
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 100000; i++) {
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
                boolean temp = linkedList.contains(i);
            }
        }
        System.out.println("LinkedList:");
        outPrintTime(finishTime10K, finishTime100K, finishTime1000K);
    }

    public void containsHashSet() {
        long startTime = 0;
        long finishTime10K = 0;
        long finishTime100K = 0;
        long finishTime1000K = 0;
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 100000; i++) {
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
                boolean temp = hashSet.contains(i);
            }
        }
        System.out.println("HashSet:");
        outPrintTime(finishTime10K, finishTime100K, finishTime1000K);
    }

    public void containsTreeSet() {
        long startTime = 0;
        long finishTime10K = 0;
        long finishTime100K = 0;
        long finishTime1000K = 0;
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 100000; i++) {
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
                boolean temp = treeSet.contains(i);
            }
        }
        System.out.println("TreeSet:");
        outPrintTime(finishTime10K, finishTime100K, finishTime1000K);
    }

    private void outPrintTime(long finishTime10K, long finishTime100K, long finishTime1000K) {
        System.out.println("The mean value time 10K = " + (finishTime10K / 100));
        System.out.println("The mean value time 100K = " + (finishTime100K / 100));
        System.out.println("The mean value time 1000K = " + (finishTime1000K / 100));
    }
}
