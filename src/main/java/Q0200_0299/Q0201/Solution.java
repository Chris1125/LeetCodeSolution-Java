package Q0200_0299.Q0201;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/bitwise-and-of-numbers-range/">数字范围按位与</a>
 * Difficulty: Medium
 * Status: Solved
 * Daily: 2020-08-23
 * @since 2020-08-23
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(rangeBitwiseAnd(5, 7));
    }

    public static int rangeBitwiseAnd(int m, int n) {
        int shift = 0;
        while (m < n) {
            m >>= 1;
            n >>= 1;
            ++shift;
        }

        return m << shift;
    }

}
