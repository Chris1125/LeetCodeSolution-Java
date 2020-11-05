package Q1300_1399.Q1365;

import java.util.Arrays;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/how-many-numbers-are-smaller-than-the-current-number/">有多少小于当前数字的数字</a>
 * Difficulty: Easy
 * Status: Solved
 * Daily: 2020-10-26
 * @since 2020-10-26
 */
public class Solution {

    public static void main(String[] args) {
        int[] input = new int[]{8, 1, 2, 2, 3};
//        int[] input = new int[]{1, 2, 1};

        System.out.println(Arrays.toString(smallerNumbersThanCurrent(input)));
    }

    /**
     * 暴力
     */
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int num : nums) {
                if (nums[i] > num) {
                    count++;
                }

            }

            res[i] = count;
        }

        return res;
    }

}
