package Q0300_0399.Q0330;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/patching-array/">按要求补齐数组</a>
 * Difficulty: Hard
 * Status: Solved
 * Daily: 2020-12-29
 * @since 2020-12-29
 */
public class Solution {

    public static void main(String[] args) {
//        int[] nums = new int[]{1, 3};
//        int n = 6;
//        int[] nums = new int[]{1, 5, 10};
//        int n = 20;
//        int[] nums = new int[]{1, 2, 2};
//        int n = 5;
        int[] nums = new int[]{1, 2, 31, 33};
        int n = 2147483647;

        System.out.println(minPatches(nums, n));
    }

    public static int minPatches(int[] nums, int n) {
        int count = 0;
        int index = 0;
        long temp = 1;
        int length = nums.length;

        while (temp <= n) {
            if (index < length && nums[index] <= temp) {
                temp += nums[index];
                index++;
            } else {
                temp *= 2;
                count++;
            }

        }

        return count;
    }

}
