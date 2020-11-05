package Q1400_1499.Q1470;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/shuffle-the-array/">重新排列数组</a>
 * Difficulty: Easy
 * Status: Solved
 * @since 2020-08-25
 */
public class Solution {

    public int[] shuffle(int[] nums, int n) {
        int length = nums.length;

        int index = 0;
        int[] result = new int[length];
        int i = 0;
        while (i < n) {
            result[index++] = nums[i];
            result[index++] = nums[i + n];
            i++;
        }

        return result;
    }

}
