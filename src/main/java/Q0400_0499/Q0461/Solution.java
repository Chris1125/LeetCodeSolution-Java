package Q0400_0499.Q0461;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/hamming-distance/">汉明距离</a>
 * Difficulty: Easy
 * Status: Solved
 * @since 2020-09-08
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(hammingDistance(1, 4));
    }

    public static int hammingDistance(int x, int y) {
        int i = x ^ y;
        int result = 0;
        while (i != 0) {
            result++;
            i &= (i - 1);
        }

        return result;
    }

}
