package Q0400_0499.Q0416;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/partition-equal-subset-sum/">分割等和子集</a>
 * Difficulty: Medium
 * Status: Solved
 * Daily: 2020-10-11
 * @since 2020-10-11
 */
public class Solution {

    public static void main(String[] args) {
//        int[] nums = new int[]{14, 9, 8, 4, 3, 2};
        int[] nums = new int[]{4, 4, 4, 4, 4, 4, 4, 4, 8, 8, 8, 8, 8, 8, 8, 8, 12, 12, 12, 12, 12, 12, 12, 12, 16, 16, 16, 16, 16, 16, 16, 16, 20, 20, 20, 20, 20, 20, 20, 20, 24, 24, 24, 24, 24, 24, 24, 24, 28, 28, 28, 28, 28, 28, 28, 28, 32, 32, 32, 32, 32, 32, 32, 32, 36, 36, 36, 36, 36, 36, 36, 36, 40, 40, 40, 40, 40, 40, 40, 40, 44, 44, 44, 44, 44, 44, 44, 44, 48, 48, 48, 48, 48, 48, 48, 48, 52, 52, 52, 52, 52, 52, 52, 52, 56, 56, 56, 56, 56, 56, 56, 56, 60, 60, 60, 60, 60, 60, 60, 60, 64, 64, 64, 64, 64, 64, 64, 64, 68, 68, 68, 68, 68, 68, 68, 68, 72, 72, 72, 72, 72, 72, 72, 72, 76, 76, 76, 76, 76, 76, 76, 76, 80, 80, 80, 80, 80, 80, 80, 80, 84, 84, 84, 84, 84, 84, 84, 84, 88, 88, 88, 88, 88, 88, 88, 88, 92, 92, 92, 92, 92, 92, 92, 92, 96, 96, 96, 96, 96, 96, 96, 96, 97, 99};

        System.out.println(canPartition(nums));
    }

    public static boolean canPartition(int[] nums) {
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        if (sum % 2 == 1) {
            return false;
        }

        int target = sum / 2;

        boolean b;
        for (int i = 0; i < nums.length; i++) {
            b = dfs(i, nums, target);
            if (b) {
                return true;
            }

        }

        return false;
    }

    private static boolean dfs(int index, int[] nums, int target) {
        if (target == 0) {
            return true;
        }

        if (target < 0) {
            return false;
        }

        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i - 1]) {
                continue;
            }

            if (dfs(i + 1, nums, target - nums[i])) {
                return true;
            }

        }

        return false;
    }

}
