package Q0400_0499.Q0455;

import java.util.Arrays;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/assign-cookies/">分发饼干</a>
 * Difficulty: Easy
 * Status: Solved
 * Daily: 2020-12-25
 * @since 2020-12-25
 */
public class Solution {

    public static void main(String[] args) {
//        int[] g = new int[]{1, 2, 3};
//        int[] s = new int[]{1, 1};
        int[] g = new int[]{1, 2};
        int[] s = new int[]{1, 2, 3};

        System.out.println(findContentChildren(g, s));
    }

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int res = 0;
        int gLength = g.length;
        int sLength = s.length;
        for (int i = 0, j = 0; i < gLength && j < sLength; i++, j++) {
            while (j < sLength && s[j] < g[i]) {
                j++;
            }

            res = res + (j < sLength ? 1 : 0);
        }

        return res;
    }

}
