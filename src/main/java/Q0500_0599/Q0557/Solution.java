package Q0500_0599.Q0557;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/reverse-words-in-a-string-iii/">反转字符串中的单词 III</a>
 * Difficulty: Easy
 * Status: Solved
 * Daily: 2020-08-30
 * @since 2020-08-30
 */
public class Solution {

    public static void main(String[] args) {
        String s = "a bc";

        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        int length = s.length();
        int wordsStart = 0;
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == ' ') {
                res.append(reverse(s.substring(wordsStart, i))).append(" ");
                wordsStart = i + 1;
            } else if (i == length - 1) {
                res.append(reverse(s.substring(wordsStart, i + 1)));
                wordsStart = i + 1;
            }

        }

        return res.toString();
    }

    public static String reverse(String s) {
        int i = 0;
        int j = s.length() - 1;
        char[] chars = s.toCharArray();
        while (i <= j) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }

        return new String(chars);
    }

}
