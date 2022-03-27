package leetcode;

import java.util.HashMap;

public class Hot560 {
    public static void main(String[] args) {

    }

    /**
     * 枚举方法
     * */
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j >= 0; --j) {
                sum += nums[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }


    public int subarraySum1(int[] nums, int k) {
        int count = 0;
        int pre = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            pre += nums[i];
            if (hashMap.containsKey(pre - k)) {
                count += hashMap.get(pre - k);
            }
            hashMap.put(pre, hashMap.getOrDefault(pre, 0) + 1);
        }
        return count;
    }
}
