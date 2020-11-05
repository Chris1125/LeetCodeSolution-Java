package Q0700_0799.Q0771;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/jewels-and-stones/">宝石与石头</a>
 * Difficulty: Easy
 * Status: Solved
 * Daily: 2020-10-02
 * @since 2020-10-02
 */
public class Solution {

    public static void main(String[] args) {
        String J = "aA";
        String S = "aAAbbbb";

        System.out.println(numJewelsInStones(J, S));
    }

    public static int numJewelsInStones(String J, String S) {
        int count = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (char c : J.toCharArray()) {
            map.put(c, 0);
        }

        for (char c : S.toCharArray()) {
            if (map.containsKey(c)) {
                count++;
            }

        }

        return count;
    }

}
