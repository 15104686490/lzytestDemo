package demo;

import net.bytebuddy.agent.builder.AgentBuilder;
import net.bytebuddy.agent.builder.ResettableClassFileTransformer;
import org.apache.flume.api.RpcClientFactory;

import java.io.File;
import java.util.*;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.stream.Collectors;

/**
 * @author lzy
 */
public class TestDemo {
    public static void main(String[] args) {
        String str = new String();
        str.isEmpty();
        ArrayList arrayList = new ArrayList();
        arrayList.isEmpty();
        //判断length size是否为零
        AbstractQueuedSynchronizer abstractQueuedSynchronizer;
        LinkedList list = new LinkedList();
        //list.remove(1);
        //list.remove();
        Integer integer = new Integer(1);
        //integer.va
        List<Integer> list1 = new ArrayList(Arrays.asList(1, 2, 3));
        List<Integer> res = list1.stream().filter(value -> (value > 2))
                .collect(Collectors.toList());
        System.out.println(res);


        //RpcClientFactory.getInstance(new Properties());


        /**
         * 添加jvm结束前，会由执行线程中的逻辑
         * 项目中主要使用此功能执行各个service的停止逻辑
         * */
        Runtime.getRuntime().addShutdownHook(new Thread((Runnable) ()->{
            System.out.println("finish!!!!");
        }, "thread-WTF"));


        ResettableClassFileTransformer resettableClassFileTransformer;
        new AgentBuilder.Default();

    }
}
