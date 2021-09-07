package demo;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class SemaphoreDemo implements Runnable {
    int value;
    Semaphore semaphore;

    public SemaphoreDemo(int value, Semaphore semaphore) {
        this.value = value;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        try {
            semaphore.acquire();
            System.out.println(String.format("当前是%d线程，目前剩余资源%d,还有%d线程在等待资源",
                    value, semaphore.availablePermits(), semaphore.getQueueLength()));
            Thread.sleep(new Random().nextInt(1000));
            semaphore.release();
            System.out.println(String.format("线程%d释放了资源", value));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3);
        for (int i = 0; i < 10; i++) {
            new Thread(new SemaphoreDemo(i, semaphore)).start();
        }
    }
}
