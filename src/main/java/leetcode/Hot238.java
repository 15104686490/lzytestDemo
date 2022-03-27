package leetcode;

public class Hot238 {
    public static void main(String[] args) {

    }
    /**
     * 构造两个数组分别为左前缀的乘积和右后缀的乘积，通过两个数组的值求出
     * 各个位置的结果
     * */
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] L = new int[length];
        int[] R = new int[length];

        int[] result = new int[length];
        L[0] = 1;
        for (int i = 1; i < length; i++) {
            L[i] = L[i - 1] * nums[i - 1];
        }

        R[length - 1] = 1;
        for (int i = length - 2; i >= 0; i--) {
            R[i] = R[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < length; i++) {
            result[i] = L[i] * R[i];
        }
        return result;

    }
}
