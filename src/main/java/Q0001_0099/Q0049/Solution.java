package Q0001_0099.Q0049;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/group-anagrams/">字母异位词分组</a>
 * Difficulty: Medium
 * Status: Solved
 * Daily: 2020-12-14
 * @since 2020-12-14
 */
public class Solution {

    public static void main(String[] args) {
        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<Long, List<String>> map = new HashMap<>();
        for (String str : strs) {
            long hash = getHash(str);
            List<String> list = map.getOrDefault(hash, new ArrayList<>());

            list.add(str);
            map.put(hash, list);
        }

        return new ArrayList<>(map.values());
    }

    public static long getHash(String str) {
        long hash = 0;
        long sum = 0;
        long prod = 1;
        for (char c : str.toCharArray()) {
            sum += c;
            prod *= c;
        }
        hash = sum + prod;
        return hash;
    }

}
