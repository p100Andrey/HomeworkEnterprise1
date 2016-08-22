package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class RemoveCollections {
    ArrayList<Integer> arrayList = new ArrayList<>();
    LinkedList<Integer> linkedList = new LinkedList<>();
    HashSet<Integer> hashSet = new HashSet<>();
    TreeSet<Integer> treeSet = new TreeSet<>();
    private int maxIteration = 1024000;
    private int startElement = 600000;
    private long iterations10K = 2560;
    private long iterations100K = 25600;
    private long iterations1000K = 256000;

    public void putToCollectionsRemove() {
        for (int i = 0; i < maxIteration; i++) {
            arrayList.add(i);
            linkedList.add(i);
            hashSet.add(i);
            treeSet.add(i);
        }
    }

    public void removeArrayList() {
        long startTime = 0;
        long finishTime10K = 0;
        long finishTime100K = 0;
        long finishTime1000K = 0;
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 1000; i++) {
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
                arrayList.remove(arrayList.size() / 2);
            }
        }
        System.out.println("ArrayList:");
        System.out.println("Time remove10K = " + (finishTime10K / 100));
        System.out.println("Time remove100K = " + (finishTime100K / 100));
        System.out.println("Time remove1000K = " + (finishTime1000K / 100));
    }

    public void removeLinkedList() {
        long startTime = 0;
        long finishTime10K = 0;
        long finishTime100K = 0;
        long finishTime1000K = 0;
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 100; i++) {
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
                linkedList.remove(linkedList.size() / 2);
            }
        }
        System.out.println("LinkedList:");
        System.out.println("Time remove10K = " + (finishTime10K / 100));
        System.out.println("Time remove100K = " + (finishTime100K / 100));
        System.out.println("Time remove1000K = " + (finishTime1000K / 100));
    }

    public void removeHashSet() {
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
                    finishTime10K = System.nanoTime() - startTime;
                }
                if (i == startElement + iterations100K) {
                    finishTime100K = System.nanoTime() - startTime;
                }
                if (i == startElement + iterations1000K) {
                    finishTime1000K = System.nanoTime() - startTime;
                }
                hashSet.remove(hashSet.size() / 2);
            }
        }
        System.out.println("HashSet:");
        System.out.println("Time remove10K = " + (finishTime10K / 100));
        System.out.println("Time remove100K = " + (finishTime100K / 100));
        System.out.println("Time remove1000K = " + (finishTime1000K / 100));
    }

    public void removeTreeSet() {
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
                    finishTime10K = System.nanoTime() - startTime;
                }
                if (i == startElement + iterations100K) {
                    finishTime100K = System.nanoTime() - startTime;
                }
                if (i == startElement + iterations1000K) {
                    finishTime1000K = System.nanoTime() - startTime;
                }
                treeSet.remove(treeSet.size() / 2);
            }
        }
        System.out.println("TreeSet:");
        System.out.println("Time remove10K = " + (finishTime10K / 100));
        System.out.println("Time remove100K = " + (finishTime100K / 100));
        System.out.println("Time remove1000K = " + (finishTime1000K / 100));
    }
}
