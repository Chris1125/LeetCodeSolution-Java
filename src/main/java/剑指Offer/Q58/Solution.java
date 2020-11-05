package 剑指Offer.Q58;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof/">左旋转字符串</a>
 * Difficulty: Easy
 * Status: Solved
 * @since 2020-09-08
 */
public class Solution {

    public static void main(String[] args) {
        String s = "abcdefg";
        int n = 2;

        System.out.println(reverseLeftWords(s, n));
    }

    public static String reverseLeftWords(String s, int n) {
        String start = s.substring(0, n);
        String end = s.substring(n);
        return end + start;
    }

}
