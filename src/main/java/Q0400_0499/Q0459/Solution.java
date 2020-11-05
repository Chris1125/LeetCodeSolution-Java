package Q0400_0499.Q0459;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/repeated-substring-pattern/">重复的子字符串</a>
 * Difficulty: Easy
 * Status: Solved
 * Daily: 2020-08-24
 * @since 2020-08-24
 */
public class Solution {

    public static void main(String[] args) {
        String s = "abab";

        System.out.println(repeatedSubstringPattern(s));
    }

    public static boolean repeatedSubstringPattern(String s) {
        int length = s.length();
        for (int i = 1; i < length; i++) {
            if (length % i != 0) {
                continue;
            }

            boolean b = true;
            for (int j = i; j < length; j++) {
                if (s.charAt(j) != s.charAt(j - i)) {
                    b = false;
                    break;
                }

            }

            if (b) {
                return true;
            }

        }

        return false;
    }

}
