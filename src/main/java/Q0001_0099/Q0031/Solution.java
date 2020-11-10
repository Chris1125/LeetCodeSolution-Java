package Q0001_0099.Q0031;

import java.util.Arrays;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/next-permutation/">下一个排列</a>
 * Difficulty: Medium
 * Status: Solved
 * Daily: 2020-11-10
 * @since 2020-11-10
 */
public class Solution {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2};

        nextPermutation(nums);

        System.out.println(Arrays.toString(nums));
    }

    public static void nextPermutation(int[] nums) {
        if (null == nums || nums.length == 0) {
            return;
        }

        int index = nums.length - 2;
        while (index >= 0 && nums[index] >= nums[index + 1]) {
            index--;
        }

        if (index >= 0) {
            int j = nums.length - 1;
            while (j >= 0 && nums[j] <= nums[index]) {
                j--;
            }

            swap(nums, index, j);
        }

        reverse(nums, index + 1, nums.length - 1);
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void reverse(int[] nums, int i, int j) {
        while (i < j) {
            swap(nums, i, j);

            i++;
            j--;
        }

    }

}
