package Q0600_0699.Q0647;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/palindromic-substrings/">回文子串</a>
 * Difficulty: Medium
 * Status: Attempted
 * Daily: 2020-08-19
 * @since 2020-08-19
 */
public class Solution {

    public static void main(String[] args) {
        String s = "dfghd";

        int i = countSubstrings(s);
        System.out.println(i);
    }

    /**
     * 暴力枚举
     */
    public static int countSubstrings(String s) {
        List<String> allCombat = getAllCombat(s);
        int result = 0;
        for (String s1 : allCombat) {
            int i = 0;
            int j = s1.length() - 1;
            boolean b = false;
            while (j >= i) {
                char start = s1.charAt(i);
                char end = s1.charAt(j);
                i++;
                j--;
                if (start != end) {
                    b = false;
                    break;
                }

                b = true;
            }

            if (b) {
                result++;
            }

        }

        return result;
    }

    public static List<String> getAllCombat(String s) {
        List<String> list = new ArrayList<>();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j <= length; j++) {
                list.add(s.substring(i, j));
            }

        }

        return list;
    }

}
