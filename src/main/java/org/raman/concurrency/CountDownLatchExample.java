package org.raman.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.function.Consumer;

import static java.lang.System.out;

/**
 * Created by ramanh3 on 09/04/2018.
 */
public class CountDownLatchExample {

    public static void main(String[] args) {
        final int count = 3;
        CountDownLatch countDownLatch = new CountDownLatch(count);
        List<Future<Integer>> results = new ArrayList<>(count);
        /*
         * In terms of resources, the newFixedThreadPool will keep all the threads running until they are explicitly terminated.
         * In the newCachedThreadPool Threads that have not been used for sixty seconds are terminated and removed from the cache
         * newCachedThreadPool is preferable when you need many short-lived asynchronous tasks
         */
        ExecutorService executor = Executors.newFixedThreadPool(count);
        for (int i = 0; i < count; i++) {
            results.add(executor.submit(new Processor(countDownLatch)));
        }
        try {
            countDownLatch.await();
            out.println("All threads are done");
            results.stream().forEach(consumeResult);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        executor.shutdown();

    }

    private static Consumer<Future<Integer>> consumeResult = (result) -> {
        try {
            final boolean done = result.isDone();
            final Integer integer = result.get();
            out.printf("Thread is %s and returned %d\n", done ? "Done" : "Not Done", integer);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    };

    public static class Processor implements Callable<Integer> {
        private CountDownLatch latch;

        Processor(CountDownLatch latch) {
            this.latch = latch;
        }

        @Override
        public Integer call() throws Exception {
            final int i = ThreadLocalRandom.current().nextInt(1, 10);
            final String name = Thread.currentThread().getName();
            out.printf("Current thread %s sleeping for %d seconds\n", name, i);
            Thread.sleep(i * 1000);
            latch.countDown();
            return i;
        }
    }
}
