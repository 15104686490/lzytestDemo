package sort;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = new int[]{100, 12, 23, 34, 2, 140, 150};
        sort(array);
        for (int i : array) {
            System.out.println(i);
        }
    }

    public static void sort(int[] array) {
        if (array == null) {
            return;
        }
        int length = array.length;
        if (array.length <= 1) {
            return;
        }
        sort(array, 0, length - 1);
    }

    public static void sort(int[] array, int low, int high) {
        if (low < high) {
            int partitionIdex = partition(array, low, high);
            sort(array, low, partitionIdex - 1);
            sort(array, partitionIdex + 1, high);
        }
    }

    /**
     * 确定新的基准位置，确定基准在数组中的正确位置（此处选择左侧第一个位置），
     * 基准左侧小于基准值，右侧大于基准值，进行比较交换
     */
    public static int partition(int[] array, int left, int right) {
        int pivot = left;
        int index = pivot + 1;
        for (int i = index; i <= right; i++) {
            if (array[i] < array[pivot]) {
                BubbleSort.swap(array, i, index);
                index++;
            }
        }
        BubbleSort.swap(array, pivot, index - 1);
        return index - 1;
    }
}
