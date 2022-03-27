package Singleton;

import java.util.concurrent.atomic.AtomicReference;

public class Singleton6 {
    public static void main(String[] args) {
        System.out.println(Singleton7.INSTANCE.getClass().toString());
    }

    private static final AtomicReference<Singleton6> INSTANCE = new AtomicReference<Singleton6>();

    private static Singleton6 instance;

    private Singleton6() {

    }

    public static final Singleton6 getInstance() {
        for (; ; ) {
            Singleton6 instance = INSTANCE.get();
            if (instance != null) {
                return instance;
            }
            INSTANCE.compareAndSet(null, new Singleton6());
            return INSTANCE.get();
        }
    }
}
