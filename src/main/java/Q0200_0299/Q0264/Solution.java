package Q0200_0299.Q0264;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/ugly-number-ii/">丑数 II</a>
 * Difficulty: Medium
 * Status: Solved
 * @since 2020-09-01
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(nthUglyNumber(10));
    }

    public static int nthUglyNumber(int n) {
        int[] res = new int[n];
        int index2 = 0;
        int index3 = 0;
        int index5 = 0;
        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = Math.min(Math.min(res[index2] * 2, res[index3] * 3), res[index5] * 5);
            if (res[i] == res[index2] * 2) index2++;
            if (res[i] == res[index3] * 3) index3++;
            if (res[i] == res[index5] * 5) index5++;
        }

        return res[n - 1];
    }

}
