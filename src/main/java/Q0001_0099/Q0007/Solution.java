package Q0001_0099.Q0007;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/reverse-integer/">整数反转</a>
 * Difficulty: Easy
 * Status: Solved
 * @since 2020-08-21
 */
public class Solution {

    public static void main(String[] args) {
        int input = 1534236462;
        System.out.println(reverse(input));
    }

    public static int reverse(int x) {
        long result = 0;

        while (x != 0) {
            int i = x % 10;

            result = result * 10 + i;

            x = x / 10;
        }

        return result > 2147483647 || result < -2147483648 ? 0 : (int) result;
    }

}
