package com.company.main;

public class Counter {

    CsvWriter csvWriter = new CsvWriter();

    public static final int ITERATIONS_NUMBER = 10;
    public static final int MAX_ITERATION = 10240;
    private final int startElement = 600;
    private final long iterations10K = 25;
    private final long iterations100K = 256;
    private final long iterations1000K = 2560;
    private long startTime = 0;
    private long finishTime10K = 0;
    private long finishTime100K = 0;
    private long finishTime1000K = 0;


    public void timeCount(int i) {
        startTime = ifStartElement(startTime, i);
        finishTime10K = ifStartElement10K(startTime, finishTime10K, i);
        finishTime100K = ifStartElement100K(startTime, finishTime100K, i);
        finishTime1000K = ifStartElement1000K(startTime, finishTime1000K, i);
    }

    private long ifStartElement(long startTime, int i) {
        if (i == startElement) {
            startTime = System.nanoTime();
        }
        return startTime;
    }

    private long ifStartElement10K(long startTime, long finishTime10K, int i) {
        if (i == startElement + iterations10K) {
            long tempFinishTime10K = System.nanoTime() - startTime;
            if (i != 0) {
                finishTime10K = (finishTime10K + tempFinishTime10K) / 2;
            } else {
                finishTime10K = tempFinishTime10K;
            }
        }
        return finishTime10K;
    }

    private long ifStartElement100K(long startTime, long finishTime100K, int i) {
        if (i == startElement + iterations100K) {
            long tempFinishTime100K = System.nanoTime() - startTime;
            if (i != 0) {
                finishTime100K = (finishTime100K + tempFinishTime100K) / 2;
            } else {
                finishTime100K = tempFinishTime100K;
            }
        }
        return finishTime100K;
    }

    private long ifStartElement1000K(long startTime, long finishTime1000K, int i) {
        if (i == startElement + iterations1000K) {
            long tempFinishTime1000K = System.nanoTime() - startTime;
            if (i != 0) {
                finishTime1000K = (finishTime1000K + tempFinishTime1000K) / 2;
            } else {
                finishTime1000K = tempFinishTime1000K;
            }
        }
        return finishTime1000K;
    }

    private void outPrintTime(long finishTime10K, long finishTime100K, long finishTime1000K) {
        System.out.println("The mean value time 10K = " + finishTime10K);
        System.out.println("The mean value time 100K = " + finishTime100K);
        System.out.println("The mean value time 1000K = " + finishTime1000K);
    }

    public void writeTime() {
        outPrintTime(finishTime10K, finishTime100K, finishTime1000K);
        csvWriter.write(Main.file, String.valueOf(finishTime10K) + ';' + String.valueOf(finishTime100K) + ';'
                + String.valueOf(finishTime1000K) + ';' + "\n");
    }
}

