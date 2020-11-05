package Q0700_0799.Q0724;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/find-pivot-index/">寻找数组的中心索引</a>
 * Difficulty: Easy
 * Status: Solved
 * @since 2020-08-25
 */
public class Solution{

    public static void main(String[] args) {
        int[] nums = new int[]{1, 7, 3, 6, 5, 6};

        System.out.println(pivotIndex(nums));
    }

    public static int pivotIndex(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (leftSum + nums[i] == sum - leftSum) {
                return i;
            }

            leftSum += nums[i];
        }

        return -1;
    }

}
