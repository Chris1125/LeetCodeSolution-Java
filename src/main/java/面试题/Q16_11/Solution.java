package 面试题.Q16_11;

import java.util.Arrays;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/diving-board-lcci/">跳水板</a>
 * Difficulty: Easy
 * Status: Solved
 * @since 2020-07-08
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(divingBoard(1, 1, 1000)));
    }

    public static int[] divingBoard(int shorter, int longer, int k) {
        if (k == 0) {
            return new int[0];
        }

        if (shorter == longer && shorter != 0) {
            return new int[]{k * shorter};
        }

        int[] result = new int[k + 1];
        for (int i = 0; i <= k; i++) {
            result[i] = i * longer + (k - i) * shorter;
        }

        return result;
    }

}
