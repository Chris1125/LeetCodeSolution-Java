package Q0001_0099.Q0050;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/powx-n/">Pow(x, n)</a>
 * Difficulty: Medium
 * Status: Solved
 * @since 2020-11-13
 */
public class Solution {

    public static void main(String[] args) {
        double x = 2.000;
        int n = Integer.MIN_VALUE;

        System.out.println(myPow(x, n));
    }

    public static double myPow(double x, int n) {
        if (n > 0) {
            return pow(x, n);
        } else if ((long) n == 0) {
            return 1;
        } else {
            return 1 / pow(x, -(long) n);
        }

    }

    public static double pow(double x, long n) {
        double res = 1.0;
        double temp = x;
        while (n > 0) {
            if (n % 2 != 0) {
                res = res * temp;
            }

            temp = temp * temp;
            n = n / 2;
        }

        return res;
    }

}
