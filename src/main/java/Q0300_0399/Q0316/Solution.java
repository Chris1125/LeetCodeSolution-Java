package Q0300_0399.Q0316;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/remove-duplicate-letters/">去除重复字母</a>
 * Difficulty: Medium
 * Status: Solved
 * Daily: 2020-12-20
 * @since 2020-12-20
 */
public class Solution {

    public static void main(String[] args) {
        String s = "babc";
        System.out.println(removeDuplicateLetters(s));
    }

    public static String removeDuplicateLetters(String s) {
        int[] count = new int[26];
        boolean[] visit = new boolean[26];

        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (!visit[c - 'a']) {
                while (sb.length() > 0 && sb.charAt(sb.length() - 1) > c) {
                    if (count[sb.charAt(sb.length() - 1) - 'a'] > 0) {
                        visit[sb.charAt(sb.length() - 1) - 'a'] = false;
                        sb.deleteCharAt(sb.length() - 1);
                    } else {
                        break;
                    }
                }

                visit[c - 'a'] = true;
                sb.append(c);
            }

            count[c - 'a']--;
        }

        return sb.toString();
    }

}
