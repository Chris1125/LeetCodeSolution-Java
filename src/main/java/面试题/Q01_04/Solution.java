package 面试题.Q01_04;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/palindrome-permutation-lcci/">回文排列</a>
 * Difficulty: Easy
 * Status: Solved
 * @since 2020-09-04
 */
public class Solution {

    public static void main(String[] args) {
        String s = "tactcoa";
        System.out.println(canPermutePalindrome(s));
    }

    public static boolean canPermutePalindrome(String s) {
        int[] character = new int[200];
        for (char c : s.toCharArray()) {
            if (character[c] == 0) {
                character[c] += 1;
            } else {
                character[c] -= 1;
            }

        }

        int count = 0;
        for (int i : character) {
            count += i;
        }

        return count <= 1;
    }

}
