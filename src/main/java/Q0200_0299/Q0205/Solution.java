package Q0200_0299.Q0205;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/isomorphic-strings/">同构字符串</a>
 * Difficulty: Easy
 * Status: Solved
 * Daily: 2020-12-27
 * @since 2020-12-27
 */
public class Solution {

    public static void main(String[] args) {

    }

    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> mapS = new HashMap<>();
        Map<Character, Character> mapT = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if (mapS.containsKey(c1) && mapS.get(c1) != c2 &&
                    mapT.containsKey(c2) && mapS.get(c2) != c2) {
                return false;
            }

            mapS.put(c1, c2);
            mapT.put(c2, c1);
        }

        return true;
    }

}
