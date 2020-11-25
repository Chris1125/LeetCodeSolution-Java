package Q1300_1399.Q1370;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/increasing-decreasing-string/">上升下降字符串</a>
 * Difficulty: Easy
 * Status: Solved
 * Daily: 2020-11-25
 * @since 2020-11-25
 */
public class Solution {

    public static void main(String[] args) {
        String s = "aaaabbbbcccc";

        System.out.println(sortString(s));
    }

    public static String sortString(String s) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        while (sb.length() < s.length()) {
            for (int i = 0; i < count.length; i++) {
                if (count[i] > 0) {
                    sb.append((char) ('a' + i));
                    count[i]--;
                }

            }

            for (int i = count.length - 1; i >= 0; i--) {
                if (count[i] > 0) {
                    sb.append((char) ('a' + i));
                    count[i]--;
                }

            }

        }

        return sb.toString();
    }

}
