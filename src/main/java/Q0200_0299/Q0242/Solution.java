package Q0200_0299.Q0242;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/valid-anagram/">有效的字母异位词</a>
 * Difficulty: Easy
 * Status: Solved
 * Daily: 2020-11-22
 * @since 2020-11-22
 */
public class Solution {

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            count[c - 'a']--;
        }

        for (int i : count) {
            if (i > 0) {
                return false;
            }

        }

        return true;
    }

}
