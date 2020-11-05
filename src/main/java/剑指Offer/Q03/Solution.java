package 剑指Offer.Q03;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/">数组中重复的数字</a>
 * Difficulty: Easy
 * Status: Solved
 * @since 2020-10-15
 */
public class Solution {

    public static void main(String[] args) {
        int[] input = new int[]{2, 3, 1, 0, 2, 5, 3};

        System.out.println(findRepeatNumber(input));
    }

    public static int findRepeatNumber(int[] nums) {
        int[] countArr = new int[nums.length];
        for (int num : nums) {
            countArr[num]++;
        }

        for (int i = 0; i < countArr.length; i++) {
            if (countArr[i] > 1) {
                return i;
            }

        }

        return 0;
    }

}
