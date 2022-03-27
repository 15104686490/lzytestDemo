package sort;

public class HillSort {
    public static void main(String[] args) {
        int[] array = new int[]{100, 12, 23, 34, 2, 140, 150};
        for (int i : sort(array)) {
            System.out.println(i);
        }
    }

    /**
     * 希尔排序思想：增量进行插入排序，按增量对数组进行分组，而后进行插入排序
     */
    public static int[] sort(int[] array) {
        int length = array.length;
        int h = 1;
        while (h < length / 3) {
            h = 3 * h + 1;
        }
        while (h >= 1) {
            for (int i = h; i < length; i++) {
                for (int j = i; j >= h && (array[j] < array[j - h]); j -= h) {
                    BubbleSort.swap(array, j, j - h);
                }
            }
            h = h / 3;
        }
        return array;
    }
}
