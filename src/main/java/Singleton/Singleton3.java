package Singleton;

/**
 * @author lzy
 */
public class Singleton3 {
    public static void main(String[] args) {

    }

    private static Singleton3 instance = new Singleton3();

    private Singleton3() {

    }

    public static Singleton3 getInstance() {
        return instance;
    }
}
