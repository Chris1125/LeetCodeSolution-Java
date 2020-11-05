package Q0400_0499.Q0485;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/max-consecutive-ones/">最大连续 1 的个数</a>
 * Difficulty: Easy
 * Status: Solved
 * @since 2020-09-04
 */
public class Solution {

    public static void main(String[] args) {
//        int[] nums = new int[]{0};
//        int[] nums = new int[]{1};
//        int[] nums = new int[]{0, 1};
//        int[] nums = new int[]{1, 0};
//        int[] nums = new int[]{0, 1, 0};
//        int[] nums = new int[]{0, 1, 0};
        int[] nums = new int[]{1, 0, 1, 1, 0, 1};

        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int count = 0;
        for (int num : nums) {
            if (num == 1) {
                count++;
            }

            if (num == 0) {
                maxCount = Math.max(maxCount, count);
                count = 0;
            }

        }

        return Math.max(maxCount, count);
    }

}
