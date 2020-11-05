package 剑指Offer.Q53;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/que-shi-de-shu-zi-lcof/">0~n-1 中缺失的数字</a>
 * Difficulty: Easy
 * Status: Solved
 * @since 2020-09-09
 */
public class Solution {

    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 2, 3, 4, 6, 7, 8, 9};

        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        int a = 0;
        for (int i = 0; i <= nums.length; i++) {
            a = a ^ i;
        }

        int b = 0;
        for (int i : nums) {
            b = b ^ i;
        }

        return a ^ b;
    }

}
