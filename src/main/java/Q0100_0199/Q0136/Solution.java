package Q0100_0199.Q0136;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/single-number/">只出现一次的数字</a>
 * Difficulty: Easy
 * Status: Solved
 * @since 2020-09-09
 */
public class Solution {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 2, 3, 2};

        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int i : nums) {
            result ^= i;
        }

        return result;
    }

}
