package Q1000_1099.Q1002;

import java.util.*;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/find-common-characters/solution/">查找常用字符串</a>
 * Difficulty: Easy
 * Status: Solved
 * Daily: 2020-10-14
 * @since 2020-10-14
 */
public class Solution {

    public static void main(String[] args) {
        String[] s = {"cool", "lock", "cook"};

        System.out.println(commonChars(s));
    }

    public static List<String> commonChars(String[] A) {
        int[] minFreq = new int[26];
        Arrays.fill(minFreq, Integer.MAX_VALUE);
        for (String word : A) {
            int[] freq = new int[26];
            int length = word.length();
            for (int i = 0; i < length; ++i) {
                char ch = word.charAt(i);
                ++freq[ch - 'a'];
            }

            for (int i = 0; i < 26; ++i) {
                minFreq[i] = Math.min(minFreq[i], freq[i]);
            }

        }

        List<String> ans = new ArrayList<>();
        for (int i = 0; i < 26; ++i) {
            for (int j = 0; j < minFreq[i]; ++j) {
                ans.add(String.valueOf((char) (i + 'a')));
            }

        }

        return ans;
    }

}
