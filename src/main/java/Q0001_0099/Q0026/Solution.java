package Q0001_0099.Q0026;

import java.util.Arrays;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/">删除排序数组中的重复项</a>
 * Difficulty: Easy
 * Status: Solved
 * @since 2020-08-14
 */
public class Solution {

    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 1;
        while (j < nums.length) {
            if (nums[i] == nums[j]) {
                j++;
            } else {
                nums[i + 1] = nums[j];
                i++;
            }

        }

        return i + 1;
    }

}
