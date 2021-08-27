package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class Hot1 {
    public static void main(String[] args) {

    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> temp = new HashMap<>();
        int[] res = null;
        if (nums == null) return res;
        if (nums.length <= 1) return res;
        for (int i = 0; i < nums.length; i++) {
            if (temp.containsKey(target - nums[i])) {
                res = new int[2];
                res[0] = i;
                res[1] = temp.get(target - nums[i]);
                break;
            } else {
                temp.put(nums[i], i);
            }
        }
        return res;
    }
}
