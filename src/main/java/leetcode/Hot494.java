package leetcode;

public class Hot494 {
    public static void main(String[] args) {

    }

    int count = 0;

    public int findTargetSumWays(int[] nums, int target) {
        backtrack(nums, target, 0, 0);
        return count;
    }

    /**
     * 利用递归的方式遍历所有可能的结果
     */
    public void backtrack(int[] nums, int target, int index, int sum) {
        if (index == nums.length) {
            if (sum == target) {
                count++;
                return;
            }
        } else {
            backtrack(nums, target, index + 1, sum + nums[index ]);
            backtrack(nums, target, index + 1, sum - nums[index ]);
        }
    }

    public int findTargetSumWays1(int[] nums, int target) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (target + sum < 0 || ((target + sum) & 1) == 1) {
            return 0;
        }
        int T = (target + sum) >> 1;
        int[] pre = new int[T + 1];
        pre[0] = 1;
        for (int i = 1; i <= nums.length; ++i) {
            int[] curr = new int[T + 1];
            for (int j = 0; j <= T; ++j) {
                curr[j] = pre[j];
                if (j - nums[i - 1] >= 0) {
                    curr[j] += pre[j - nums[i - 1]];
                }
            }
            pre = curr;
        }
        return pre[T];
    }
}
