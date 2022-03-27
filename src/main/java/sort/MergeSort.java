package sort;

public class MergeSort {
    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        int[] array = new int[]{100, 12, 23, 34, 2, 140, 150};
        mergeSort.sort(array);
        for (int i : array) {
            System.out.println(i);
        }
    }

    protected int[] asitArray;

    public void sort(int[] array) {
        int length = array.length;
        asitArray = new int[length];
        sort(array, 0, length - 1);
    }

    /**
     * 归并排序思路，通过递归将数组划分为更小的粒度进行合并排序
     */
    public void sort(int[] array, int l, int h) {
        if (h <= l) {
            return;
        }
        int mid = l + (h - l) / 2;
        sort(array, l, mid);
        sort(array, mid + 1, h);
        merge(array, l, mid, h);
    }

    /**
     * 合并方法，参数数组，低位index，中位index，高位index
     */
    public void merge(int[] array, int l, int m, int h) {
        int i = l;
        int j = m + 1;
        for (int k = l; k <= h; k++) {
            asitArray[k] = array[k];
        }
        for (int k = l; k <= h; k++) {
            if (i > m) {
                array[k] = asitArray[j++];
            } else if (j > h) {
                array[k] = asitArray[i++];
            } else if (asitArray[i] < asitArray[j]) {
                array[k] = asitArray[i++];
            } else {
                array[k] = asitArray[j++];
            }
        }
    }
}
