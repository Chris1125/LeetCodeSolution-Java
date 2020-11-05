package Q0001_0099.Q0014;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/longest-common-prefix/">最长公共前缀</a>
 * Difficulty: Easy
 * Status: Solved
 * @since 2020-09-09
 */
public class Solution {

    public static void main(String[] args) {
//        String[] strs = {"flower", "flow", "flight"};
        String[] strs = {"dog", "racecar", "car"};

        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        if (strs[0].length() == 0) {
            return "";
        }

        StringBuilder prefix = new StringBuilder();
        for (int i = 0; i < strs[0].length(); i++) {
            String pre = strs[0].substring(i, i + 1);

            for (String str : strs) {
                if (i == str.length()) {
                    return prefix.toString();
                }

                if (!str.substring(i, i + 1).equals(pre)) {
                    return prefix.toString();
                }

                pre = str.substring(i, i + 1);
            }

            prefix.append(pre);
        }

        return prefix.toString();
    }

}
