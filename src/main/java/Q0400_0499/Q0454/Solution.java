package Q0400_0499.Q0454;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/4sum-ii/">四数相加 II</a>
 * Difficulty: Medium
 * Status: Solved
 * Daily: 2020-11-27
 * @since 2020-11-27
 */
public class Solution {

    public static void main(String[] args) {
        int[] A = new int[]{1, 2};
        int[] B = new int[]{-2, -1};
        int[] C = new int[]{-1, 2};
        int[] D = new int[]{0, 2};

        System.out.println(fourSumCount(A, B, C, D));
    }

    public static int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> countAB = new HashMap<>();
        for (int u : A) {
            for (int v : B) {
                countAB.put(u + v, countAB.getOrDefault(u + v, 0) + 1);
            }

        }

        int res = 0;
        for (int u : C) {
            for (int v : D) {
                if (countAB.containsKey(-u - v)) {
                    res += countAB.get(-u - v);
                }

            }

        }

        return res;
    }

}
