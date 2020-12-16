package Q0200_0299.Q0290;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/word-pattern/">单词规律</a>
 * Difficulty: Easy
 * Status: Solved
 * Daily: 2020-12-16
 * @since 2020-12-16
 */
public class Solution {

    public static void main(String[] args) {
        String pattern = "abba";
        String str = "dog cat cat dog";

        System.out.println(wordPattern(pattern, str));
    }

    public static boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        String[] s1 = s.split(" ");
        if (pattern.length() != s1.length) {
            return false;
        }

        for (int i = 0; i < pattern.length(); i++) {
            char key = pattern.charAt(i);
            String value = s1[i];
            if (!map.containsKey(key)) {
                map.put(key, value);
                boolean add = set.add(value);
                if (!add) {
                    return false;
                }
            } else {
                if (!map.get(key).equals(value)) {
                    return false;
                }

            }

        }

        return true;
    }

}
