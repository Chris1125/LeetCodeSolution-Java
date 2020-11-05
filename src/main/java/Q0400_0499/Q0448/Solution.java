package Q0400_0499.Q0448;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/find-all-numbers-disappeared-in-an-array/">找到所有数组中消失的数字</a>
 * Difficulty: Easy
 * Status: Solved
 * @since 2020-09-17
 */
public class Solution {

    public static void main(String[] args) {
        int[] nums = new int[]{4, 3, 2, 7, 8, 2, 3, 1};

        System.out.println(findDisappearedNumbers1(nums));
    }

    /**
     * Space: O(n)
     */
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();

        int[] count = new int[nums.length + 1];
        for (int num : nums) {
            count[num]++;
        }

        for (int i = 1; i < count.length; i++) {
            if (count[i] == 0) {
                result.add(i);
            }

        }

        return result;
    }

    /**
     * Space: O(1)
     */
    public static List<Integer> findDisappearedNumbers1(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] >= 0) {
                nums[index] = -nums[index];
            }

        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) result.add(i + 1);
        }

        return result;
    }

}
