package Q0300_0399.Q0389;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/find-the-difference/">找不同</a>
 * Difficulty: Easy
 * Status: Solved
 * Daily: 2020-12-18
 * @since 2020-12-18
 */
public class Solution {

    public static void main(String[] args) {
//        String s = "abcd";
//        String t = "abcde";
//        String s = "";
//        String t = "a";
        String s = "ae";
        String t = "aea";

        System.out.println(findTheDifference(s, t));
    }

    public static char findTheDifference(String s, String t) {
        int length = s.length();
        char res = t.charAt(length);
        for (int i = 0; i < length; i++) {
            res ^= s.charAt(i);
            res ^= t.charAt(i);
        }

        return res;
    }

}
