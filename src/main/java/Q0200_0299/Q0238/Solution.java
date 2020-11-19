package Q0200_0299.Q0238;

import java.util.Arrays;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/move-zeroes/">移动零</a>
 * Difficulty: Easy
 * Status:
 * Daily: 2020-11-19
 * @since 2020-11-19
 */
public class Solution {

    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 0, 3, 12};

        moveZeroes(nums);

        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums) {
        if (null == nums) {
            return;
        }

        int i = 0;
        int j = 0;
        int length = nums.length;
        while (i < length) {
            if (nums[i] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }

            i++;
        }

    }

}
