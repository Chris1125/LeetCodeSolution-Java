package Q0700_0799.Q0738;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/monotone-increasing-digits/">单调递增的数字</a>
 * Difficulty: Medium
 * Status: Solved
 * Daily: 2020-12-15
 * @since 2020-12-15
 */
public class Solution {

    public static void main(String[] args) {
        int N = 131;

        System.out.println(monotoneIncreasingDigits(N));
    }

    public static int monotoneIncreasingDigits(int N) {
        char[] strN = Integer.toString(N).toCharArray();
        int i = 1;
        while (i < strN.length && strN[i - 1] <= strN[i]) {
            i += 1;
        }

        if (i < strN.length) {
            while (i > 0 && strN[i - 1] > strN[i]) {
                strN[i - 1] -= 1;
                i -= 1;
            }

            for (i += 1; i < strN.length; ++i) {
                strN[i] = '9';
            }
        }

        return Integer.parseInt(new String(strN));
    }

}
