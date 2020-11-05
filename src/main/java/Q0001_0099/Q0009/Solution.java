package Q0001_0099.Q0009;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/palindrome-number/">回文数</a>
 * Difficulty: Easy
 * Status: Solved
 * @since 2020-08-30
 */
public class Solution {

    public static void main(String[] args) {
        int i = 12321;

        System.out.println(isPalindrome(i));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0 || (x > 0 && x % 10 == 0)) return false;

        int res = 0;
        int input = x;
        while (x > 0) {
            int high = x % 10;

            res = res * 10 + high;
            x /= 10;
        }

        return res == input;
    }
}
