package Q0001_0099.Q0035;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/search-insert-position/">搜索插入位置</a>
 * Difficulty: Easy
 * Status: Solved
 * @since 2020-09-14
 */
public class Solution {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5};
        int target = 3;

        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
        if (target < nums[0]) {
            return 0;
        }

        int length = nums.length;
        if (target > nums[length - 1]) {
            return length;
        }

        int left = 0;
        int right = length - 1;
        int result = -1;
        while (left <= right) {
            int mid = (right - left) / 2 + left;

            if (target <= nums[mid]) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }

        return result;
    }

}