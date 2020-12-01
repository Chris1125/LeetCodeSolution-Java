package Q0001_0099.Q0034;

import java.util.Arrays;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array/">在排序数组中查找元素的第一个和最后一个位置</a>
 * Difficulty: Medium
 * Status: Solved
 * Daily: 2020-12-01
 * @since 2020-12-01
 */
public class Solution {

    public static void main(String[] args) {
//        int[] nums = new int[]{5, 7, 7, 8, 8, 10};
        int[] nums = new int[]{};
        int target = 8;

        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    public static int[] searchRange(int[] nums, int target) {
        if (null == nums || nums.length == 0 || target > nums[nums.length - 1] || target < nums[0]) {
            return new int[]{-1, -1};
        }

        int left = 0;
        int right = nums.length - 1;
        int rightIndex = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (target >= nums[mid]) {
                rightIndex = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }

        left = 0;
        right = nums.length - 1;
        int leftIndex = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (target <= nums[mid]) {
                leftIndex = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }

        if (nums[leftIndex] != target || nums[rightIndex] != target) {
            return new int[]{-1, -1};
        }

        return new int[]{leftIndex, rightIndex};
    }

}
