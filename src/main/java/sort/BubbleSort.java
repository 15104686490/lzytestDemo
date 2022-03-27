package sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[]{100, 12, 23, 34, 2, 140, 150};
        for (int i : sort(array)) {
            System.out.println(i);
        }

        for (int i : sort(array)) {
            System.out.println(i);
        }
    }
    /**
     * 冒泡排序思路：遇到相对大的数就进行交换，每趟确定最大的一个数
     * 增加boolean，若一趟遍历之后为true，则表示余下的数为有序的
     * 不需要再通过下趟进行排序
     * */
    public static int[] sort(int[] array) {
        int count = 1;
        int[] res = Arrays.copyOf(array, array.length);
        int length = res.length;
        boolean isSort = false;
        for (int i = length - 1; i > 0 && !isSort; i--) {
            isSort = true;
            System.out.println("this is " + count + " time");
            count++;
            for (int j = 0; j < i; j++) {
                if (res[j] > res[j + 1]) {
                    isSort = false;
                    swap(res, j, j + 1);
                }
            }
        }
        return res;
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
