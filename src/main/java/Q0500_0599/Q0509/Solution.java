package Q0500_0599.Q0509;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/fibonacci-number/">斐波那契数</a>
 * Difficulty: Easy
 * Status: Solved
 * Daily: 2021-01-04
 * @since 2021-01-04
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(fib1(4));
    }

    public static int fib(int n) {
        if (n < 2) {
            return n;
        }

        int a = 0;
        int b = 1;
        int c = 2;
        while (n >= 2) {
            a = b;
            b = c;
            c = a + b;
            n--;
        }

        return a;
    }

    public static int fib1(int n) {
        if (n < 2) {
            return n;
        }

        int[] f = new int[n + 1];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }

        return f[n];
    }

}
