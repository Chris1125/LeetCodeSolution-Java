package Q0300_0399.Q0327;

import java.math.BigInteger;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/count-of-range-sum/">区间和的个数</a>
 * Difficulty: Hard
 * Status: TODO
 * Daily: 2020-11-07
 * @since 2020-11-07
 */
public class Solution {

    public static void main(String[] args) {
//        int[] nums = new int[]{-2, 5, -1};
//        int lower = -2;
//        int upper = 2;
        int[] nums = new int[]{-2147483647, 0, -2147483647, 2147483647};
        int lower = -564;
        int upper = 3864;
        System.out.println(countRangeSum(nums, lower, upper));
    }

    public static int countRangeSum(int[] nums, int lower, int upper) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            BigInteger sum = BigInteger.valueOf(0);
            for (int j = i; j < nums.length; j++) {
                sum = sum.add(BigInteger.valueOf(nums[j]));
                if (sum.compareTo(BigInteger.valueOf(lower)) > 0 && sum.compareTo(BigInteger.valueOf(upper)) < 0) {
                    count++;
                }

            }

        }

        return count;
    }

}
