package leetcode;

public class Hot152 {
    public static void main(String[] args) {

    }

    public int maxProduct(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int res = nums[0];
        int length = nums.length;
        for (int i = 1; i < length; ++i) {
            int tempMax = max;
            int tempMin = min;
            max = Math.max(tempMax * nums[i], Math.max(nums[i], tempMin * nums[i]));
            min = Math.min(tempMin * nums[i], Math.min(nums[i], tempMax * nums[i]));
            res = Math.max(max, res);
        }
        return res;
    }
}
