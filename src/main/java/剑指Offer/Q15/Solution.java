package 剑指Offer.Q15;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/er-jin-zhi-zhong-1de-ge-shu-lcof/">进制中1的个数</a>
 * Difficulty: Easy
 * Status: Solved
 * @since 2020-09-02
 */
public class Solution {

    public static void main(String[] args) {
        int n = 118;

        System.out.println(hammingWeight(n));
    }

    public static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count += n & 1;
            n >>= 1;
        }

        return count;
    }

}
