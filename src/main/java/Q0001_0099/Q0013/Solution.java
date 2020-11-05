package Q0001_0099.Q0013;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/roman-to-integer/">罗马数字转整数</a>
 * Difficulty: Easy
 * Status: Solved
 * @since 2020-08-30
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        int sum = 0;
        int pre = getNum(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            int num = getNum(s.charAt(i));
            if (pre < num) {
                sum -= pre;
            } else {
                sum += pre;
            }

            pre = num;
        }

        sum += pre;
        return sum;
    }

    public static int getNum(char c) {
        switch (c) {
            case 'I':
                return 1;

            case 'V':
                return 5;

            case 'X':
                return 10;

            case 'L':
                return 50;

            case 'C':
                return 100;

            case 'D':
                return 500;

            case 'M':
                return 1000;

            default:
                return 0;
        }

    }

}
