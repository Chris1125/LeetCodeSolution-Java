package Q0200_0299.Q0283;

import java.util.Arrays;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/move-zeroes/">移动零</a>
 * Difficulty: Easy
 * Status: Solved
 * @since 2020-09-14
 */
public class Solution {

    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 2, 3, 0, 0, 5, 0, 6, 0, 8};
//        int[] nums = new int[]{1};
//        int[] nums = new int[]{2, 1};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i != index) {
                    nums[index++] = nums[i];
                    nums[i] = 0;
                } else {
                    index++;
                }

            }

        }

    }

}
