package sort;

public class InsertSort {
    public static void main(String[] args) {
        int[] array = new int[]{100, 12, 23, 34, 2, 140, 150};
        for (int i : sort(array)) {
            System.out.println(i);
        }
    }

    /**
     * 插入排序思路：将当前位置元素插入左侧有序数组，并在逆序时进行交换，
     * 遍历后获得有序数组
     * */
    public static int[] sort(int[] array) {
        if (array == null) {
            return array;
        }
        int length = array.length;
        if (length <= 1) {
            return array;
        }

        for (int i = 1; i < length; i++) {
            for (int j = i; j > 0 && (array[j] < array[j - 1]); j--) {
                BubbleSort.swap(array, j, j - 1);
            }
        }
        return array;
    }
}
