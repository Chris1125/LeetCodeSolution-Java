package Q0001_0099.Q0017;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number/">电话号码数字组合</a>
 * Difficulty: Medium
 * Status: Solved
 * Daily: 2020-08-26
 * @since 2020-08-26
 */
public class Solution {

    public static void main(String[] args) {
        String input = "234";

        System.out.println(letterCombinations(input));
    }

    public static List<String> letterCombinations(String digits) {
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        String string = "";
        List<String> res = new ArrayList<>();
        getAllCombine(digits, map, 0, string, res);

        return res;
    }

    public static void getAllCombine(String digits, Map<Character, String> map, int index, String s, List<String> res) {
        if (index == digits.length()) {
            return;
        }

        String nums = map.get(digits.charAt(index));
        for (int j = 0; j < nums.length(); j++) {
            String s1 = s + nums.substring(j, j + 1);
            getAllCombine(digits, map, index + 1, s1, res);
            if (s1.length() == digits.length()) {
                res.add(s1);
            }

        }

    }

}
