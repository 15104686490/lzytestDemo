package test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class SemapTest implements Runnable {
    final Semaphore semp = new Semaphore(5);

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(20);
        Thread thread = new Thread();
        final SemapTest semapTest = new SemapTest();
        for (int i = 0; i < 20; i++) {
            executorService.submit(semapTest);
        }
    }

    @Override
    public void run() {
        try {
            semp.acquire();
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getId() + ":done!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semp.release();
        }
    }
}
