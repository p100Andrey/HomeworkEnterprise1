package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorAddCollections {
    ArrayList<Integer> arrayList = new ArrayList<>();
    LinkedList<Integer> linkedList = new LinkedList<>();
    ListIterator<Integer> listIteratorOfArrayList;
    ListIterator<Integer> listIteratorOfLinkedList;
    private int maxIteration = 1024000;
    private int startElement = 600000;
    private long iterations10K = 2560;
    private long iterations100K = 25600;
    private long iterations1000K = 256000;

    public void putToCollectionsListIteratorAdd() {
        for (int i = 0; i < maxIteration; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }
        listIteratorOfArrayList = arrayList.listIterator();
        listIteratorOfLinkedList = linkedList.listIterator();
    }

    public void listIteratorAddToArrayList() {
        long startTime = 0;
        long finishTime10K = 0;
        long finishTime100K = 0;
        long finishTime1000K = 0;
        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < 10000; i++) {
                if (i == 0) {
                    startTime = System.nanoTime();
                }
                if (i == 0 + iterations10K) {
                    finishTime10K = System.nanoTime() - startTime;
                }
//                if (i == startElement + iterations100K) {
//                    finishTime100K = System.nanoTime() - startTime;
//                }
//                if (i == startElement + iterations1000K) {
//                    finishTime1000K = System.nanoTime() - startTime;
//                }
                listIteratorOfArrayList.next();
                listIteratorOfArrayList.add(0);
            }
        }
        System.out.println("ArrayList:");
        System.out.println("The mean value time 10K = " + (finishTime10K / 100));
//        System.out.println("The mean value time 100K = " + (finishTime100K / 100));
//        System.out.println("The mean value time 1000K = " + (finishTime1000K / 100));
    }

    public void listIteratorAddToLinkedList() {
        long startTime = 0;
        long finishTime10K = 0;
        long finishTime100K = 0;
        long finishTime1000K = 0;
        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < 10000; i++) {
                if (i == 0) {
                    startTime = System.nanoTime();
                }
                if (i == 0 + iterations10K) {
                    finishTime10K = System.nanoTime() - startTime;
                }
//                if (i == startElement + iterations100K) {
//                    finishTime100K = System.nanoTime() - startTime;
//                }
//                if (i == startElement + iterations1000K) {
//                    finishTime1000K = System.nanoTime() - startTime;
//                }
                listIteratorOfLinkedList.next();
                listIteratorOfLinkedList.add(0);
            }
        }
        System.out.println("LinkedList:");
        System.out.println("The mean value time 10K = " + (finishTime10K / 100));
//        System.out.println("The mean value time 100K = " + (finishTime100K / 100));
//        System.out.println("The mean value time 1000K = " + (finishTime1000K / 100));
    }
}
