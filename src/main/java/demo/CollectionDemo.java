package demo;

import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {

        /*Set, List, Map, SortedSet, SortedMap, HashSet, TreeSet, ArrayList, LinkedList, Vector, Collections, Arrays, AbstractCollection*/
        Collection<Integer> collection = new ArrayList(); //root intrface
        collection.add(1);
        collection.add(2);
        collection.add(3);
        collection.add(4);
        collection.add(5);
        collection.removeIf(a -> a >= 3);// 1.8中新增 删除集合中符合条件的元素 配合表达式使用
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
        //collection = null;
        System.out.println(collection.isEmpty());
        //Spliterator 并行遍历

        List list = new ArrayList<>();// list interface
        int old = 10;
        int newValue = old + (old >> 1);
        System.out.println("new value : " + newValue);

        ArrayList arrayList = new ArrayList();
        Vector vector = new Vector();
        LinkedList linkedList = new LinkedList();
        PriorityQueue priorityQueue = new PriorityQueue();

        Set set = new HashSet();// set interface
        HashSet hashSet = new HashSet();
        TreeSet treeSet = new TreeSet();
        LinkedHashSet linkedHashSet = new LinkedHashSet();

        Stack stack = new Stack();

    }
}
