package Q0300_0399.Q0344;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/reverse-string/">反转字符串</a>
 * Difficulty: Easy
 * Status: Solved
 * Daily: 2020-10-08
 * @since 2020-07-07
 */
public class Solution {

    public static void main(String[] args) {
        char[] chars = new char[]{'w', 'a', 'n', 'g', 'y', 'a', 'n', 'g'};

        reverseString(chars);
    }

    private static void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;
        while (start <= end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }

    }

}
