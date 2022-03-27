package sort;

public class HeapSort {


    public static void main(String[] args) {
        int[] array = new int[]{100, 12, 23, 34, 2, 140, 150};
        sort(array);
        for (int i : array) {
            System.out.println(i);
        }
        new HeapSort().testMethod();
    }

    /**
     * 堆排序思路：创建初始化堆，创建大顶堆或小顶堆，
     * 大顶堆：父节点大于两个子节点，升序
     * 小顶堆：小于，降序
     * 而后将根节点和叶子节点交换，并进行调整
     */
    public static void sort(int[] array) {
        Object object = new Object();


        int length = array.length;
        buildMaxHeap(array, length);
        for (int i = length - 1; i > 0; i--) {
            BubbleSort.swap(array, 0, i);
            length--;
            heapify(array, 0, length);
        }
    }

    public static void buildMaxHeap(int[] array, int length) {
        for (int i = (int) Math.floor(length / 2); i >= 0; i--) {
            heapify(array, i, length);
        }
    }

    private static void heapify(int[] array, int i, int length) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = i;

        if (left < length && array[left] > array[largest]) {
            largest = left;
        }

        if (right < length && array[right] > array[largest]) {
            largest = right;
        }

        if (largest != i) {
            BubbleSort.swap(array, largest, i);
            heapify(array, largest, length);
        }
    }

    public synchronized void testMethod() {
        System.out.println("test");
    }
}
