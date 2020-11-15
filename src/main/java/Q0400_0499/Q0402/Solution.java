package Q0400_0499.Q0402;

import java.util.LinkedList;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/remove-k-digits/">移掉 K 位数字</a>
 * Difficulty: Medium
 * Status: Solved
 * Daily: 202-11-15
 * @since 2020-11-15
 */
public class Solution {

    public static void main(String[] args) {
//        String num = "1432219";
//        int k = 3;
//        String num = "10200";
//        int k = 2;
        String num = "11734";
        int k = 2;
        System.out.println(removeKdigits(num, k));
    }

    public static String removeKdigits(String num, int k) {
        if (k >= num.length()) {
            return "0";
        }

        LinkedList<Character> list = new LinkedList<>();
        for (char c : num.toCharArray()) {
            if (!list.isEmpty() && list.getLast() > c && k > 0) {
                list.removeLast();
                k--;
            }

            list.add(c);
        }

        while (k > 0) {
            list.removeLast();
            k--;
        }

        StringBuilder sb = new StringBuilder();
        boolean b = true;
        for (Character character : list) {
            if (b && character == '0') {
                continue;
            }

            b = false;
            sb.append(character);
        }

        if (sb.length() == 0) {
            sb.append(0);
        }

        return sb.toString();
    }

}
