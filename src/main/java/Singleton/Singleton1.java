package Singleton;

/**
 * @author lzy
 */
public class Singleton1 {
    public static void main(String[] args) {

    }

    private static Singleton1 instance;

    private Singleton1() {

    }

    public static Singleton1 getInstance() {
        if (instance != null) {
            return instance;
        }
        instance = new Singleton1();
        return instance;
    }

    /*增加修饰实现线程安全的懒汉模式*/
    public static synchronized Singleton1 getInstanceSafe() {
        if (instance != null) {
            return instance;
        }
        instance = new Singleton1();
        return instance;
    }



}
