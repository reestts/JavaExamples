package com.reestts.concurrency;

import java.util.concurrent.*;

public class SpeedComparing {

    static final int NUMBER_OF_THREADS = 4;
    static final int SUM = 100000000;

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        calculateSum();
        calculateSum(NUMBER_OF_THREADS);
    }

    public static long calculateSum() {
        long startTime = System.currentTimeMillis();

        long sum = 0;
        for (int i = 1; i <= SUM; i++) {
            sum += i;
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Однопоточный метод выполнился за: " + (endTime - startTime) + " миллисекунд");

        return sum;
    }

    public static long calculateSum(int numberOfThreads) throws InterruptedException, ExecutionException {
        long startTime = System.currentTimeMillis();

        ExecutorService executor = Executors.newFixedThreadPool(numberOfThreads);
        long sum = 0;
        int chunkSize = SUM / numberOfThreads;
        Future<Long>[] futures = new Future[numberOfThreads];

        for (int i = 0; i < numberOfThreads; i++) {
            int start = i * chunkSize + 1;
            int end = (i == numberOfThreads - 1) ? SUM : (i + 1) * chunkSize;
            futures[i] = executor.submit(new SumTask(start, end));
        }

        for (Future<Long> future : futures) {
            sum += future.get();
        }

        executor.shutdown();

        long endTime = System.currentTimeMillis();
        System.out.println("Многопоточный метод (" + numberOfThreads + " потоков) выполнился за: " + (endTime - startTime) + " миллисекунд");

        return sum;
    }

    private static class SumTask implements Callable<Long> {
        private final int start;
        private final int end;

        public SumTask(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public Long call() {
            long sum = 0;
            for (int i = start; i <= end; i++) {
                sum += i;
            }
            return sum;
        }
    }
}
