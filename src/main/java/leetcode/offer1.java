package leetcode;

public class offer1 {
    public static int findRepeatNumber(int[] nums) {
        //int result = 0;
        /*HashSet hashSet = new HashSet();
        if (nums.length == 0 || nums.length == 1) return -1;
        Arrays.sort(nums);
        for (int i : nums) {
            if(!hashSet.add(i)){
                return i;
            }
        }
        return -1;*/
        if (nums.length == 0 || nums.length == 1) return -1;
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == i) {
                i++;
                continue;
            }
            if (nums[i] == nums[nums[i]]) return nums[i];
            swap(i, nums[i], nums);
        }
        return -1;
    }

    public static void swap(int index, int value, int[] nums) {
        int temp = 0;
        temp = nums[index];
        nums[index] = nums[value];
        nums[value] = temp;
    }

    public static void main(String[] args) {
        int[] array = new int[]{3, 4, 2, 0, 0, 1};
        System.out.println(findRepeatNumber(array));
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
