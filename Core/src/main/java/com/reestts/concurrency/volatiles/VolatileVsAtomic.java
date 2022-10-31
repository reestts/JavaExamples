package com.reestts.concurrency.volatiles;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class VolatileVsAtomic {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        VolatileTest volatileTest = new VolatileTest();

        var executorService = Executors.newFixedThreadPool(2);

        var secondFuture = executorService.submit(() -> {
            for (int i = 0; i < 1000000; i++) {
                volatileTest.increment();
            }
        });

        var firstFuture = executorService.submit(() -> {
            for (int i = 0; i < 1000000; i++) {
                volatileTest.increment();
            }
        });

        firstFuture.get();
        secondFuture.get();

        System.out.println(volatileTest.getValue());
    }

    static class VolatileTest {

        private AtomicInteger value = new AtomicInteger();

        public void increment() {
            value.incrementAndGet();
        }

        public int getValue() {
            return value.get();
        }
    }
}
