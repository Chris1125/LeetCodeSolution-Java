package Q1500_1599.Q1512;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/number-of-good-pairs/">好数对的数目</a>
 * Difficulty: Easy
 * Status: Solved
 * @since 2020-08-25
 */
public class Solution {

    public static void main(String[] args) {
        int[] input = new int[]{1, 2, 3, 1, 1, 3};

        System.out.println(numIdenticalPairs(input));
    }

    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        int[] counts = new int[101];
        for (int i : nums) {
            counts[i]++;
        }

        for (int i : counts) {
            count += i * (i - 1) / 2;
        }

        return count;
    }

}
