package Q0100_0199.Q0169;

import java.util.Arrays;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/majority-element/">多数元素</a>
 * Difficulty: Easy
 * Status: Solved
 * @since 2020-09-10
 */
public class Solution {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 1, 2, 1, 2, 2};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

}
