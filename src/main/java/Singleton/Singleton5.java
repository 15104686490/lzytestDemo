package Singleton;

public class Singleton5 {
    public static void main(String[] args) {

    }

    /*
    这里添加volatile
    由于编译器的优化、JVM的优化、可能会出现指令重排
    1.在堆中开辟所需的空间，分配内存地址
    2.根据类加载的初始化顺序进行初始化 对象初始化
    3.将内存地址返回给栈中的变量 将对象引用指向内存地址
    重排后 执行了1 3，此时若某个线程执行了判空操作将失败
    使用对象，但因为还没有初始化，会报错，避免指令重排
    */

    public static volatile Singleton5 instance;

    private Singleton5() {

    }

    public static Singleton5 getInstance() {
        if (instance != null) {
            return instance;
        }
        synchronized (Singleton5.class) {
            if (instance == null) {
                instance = new Singleton5();
            }
        }
        return instance;
    }
}
