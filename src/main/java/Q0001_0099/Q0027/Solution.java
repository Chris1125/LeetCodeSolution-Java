package Q0001_0099.Q0027;

import java.util.Arrays;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/remove-element/">移除元素</a>
 * Difficulty: Easy
 * Status: Solved
 * @since 2020-09-18
 */
public class Solution {

    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;

        System.out.println(removeElement(nums, val));
        System.out.println(Arrays.toString(nums));
    }

    public static int removeElement(int[] nums, int val) {
        int index = 0;
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (nums[i] == val) {
                continue;
            }

            nums[index++] = nums[i];
        }

        return index;
    }

}
