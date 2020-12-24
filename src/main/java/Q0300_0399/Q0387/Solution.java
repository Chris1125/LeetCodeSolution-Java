package Q0300_0399.Q0387;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/first-unique-character-in-a-string/">字符串中的第一个唯一字符</a>
 * Difficulty: Easy
 * Status: Solved
 * Daily: 2020-12-23
 * @since 2020-12-23
 */
public class Solution {

    public static void main(String[] args) {
        String s = "leetcode";

        System.out.println(firstUniqChar(s));
    }

    public static int firstUniqChar(String s) {
        int[] count = new int[26];
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            count[c - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }

}
