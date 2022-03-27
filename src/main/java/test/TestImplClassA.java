package test;

import net.sf.cglib.proxy.Enhancer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

public class TestImplClassA implements TestInterface {
    public static void main(String[] args) {
        new TestImplClassA().methodA();
        Collection collection = new ArrayList<>();
        Enhancer enhancer = new Enhancer();
        //enhancer.create();

        HashSet hashSet = new HashSet();
        hashSet.add(new Object());
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put("", "");
        concurrentHashMap.remove("");
        MapTest mapTest = new MapTest();
        mapTest.put("", "");
        Thread thread = new Thread();
        /*ThreadPoolExecutor*/
        ExecutorService executorService;
        AbstractQueuedSynchronizer abstractQueuedSynchronizer;
        Semaphore sem;
        String str1 = new String("a");
        String str2 = new String("a");
        String str3 = "a";
        String str4 = "a";

        System.out.println(str1 == str2);
        System.out.println(str3 == str4);

        final String str5 = "a";
        final String str6 = "b";
        String str7 = str5 + str6;
        String str8 = "a" + "b";
        System.out.println(str7 == str8);




    }
}
