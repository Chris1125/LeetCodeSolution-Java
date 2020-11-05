package Q0001_0099.Q0003;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/">无重复字符的最长子串</a>
 * Difficulty: Medium
 * Status: Solved
 * @since 2020-08-26
 */
public class Solution {

    public static void main(String[] args) {
//        String s = "abcabcbb";
//        String s = "bbbbb";
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLen = 0;
        Map<String, Integer> map = new HashMap<>();
        for (int end = 0, start = 0; end < n; end++) {
            String substring = s.substring(end, end + 1);
            if (map.containsKey(substring)) {
                start = Math.max(map.get(substring), start);
            }

            maxLen = Math.max(maxLen, end - start + 1);
            map.put(substring, end + 1);
        }

        return maxLen;
    }

}
