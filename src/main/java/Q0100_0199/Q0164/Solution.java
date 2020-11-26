package Q0100_0199.Q0164;

import java.util.Arrays;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/maximum-gap/">最大间距</a>
 * Difficulty: Hard
 * Status: Solved
 * Daily: 2020-11-26
 * @since 2020-11-26
 */
public class Solution {

    public static void main(String[] args) {
        int[] nums = new int[]{3, 6, 9, 1};

        System.out.println(maximumGap(nums));
    }

    public static int maximumGap(int[] nums) {
        Arrays.sort(nums);

        int maxGap = 0;
        for (int i = 1; i < nums.length; i++) {
            maxGap = Math.max(nums[i] - nums[i - 1], maxGap);
        }

        return maxGap;
    }

}
