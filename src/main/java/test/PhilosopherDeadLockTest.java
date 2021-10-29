package test;

public class PhilosopherDeadLockTest {
    protected Object tool;
    static Object fork1 = new Object();
    static Object fork2 = new Object();
    String str;
    Integer integer;

    public PhilosopherDeadLockTest(Object o) {
        this.tool = o;
        if(tool == fork1){

        }
    }
}
