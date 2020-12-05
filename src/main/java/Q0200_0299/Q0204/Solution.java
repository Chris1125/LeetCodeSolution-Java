package Q0200_0299.Q0204;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/count-primes/">计数质数</a>
 * Difficulty: Easy
 * Status: Solved
 * Daily: 2020-12-03
 * @since 2020-12-03
 */
public class Solution {

    public static void main(String[] args) {
//        int n = 10;
        int n = 499979;
        System.out.println(countPrimes(n));
    }

    public static int countPrimes(int n) {
        int count = 0;

        for (int i = 2; i < n; ++i) {
            if (isPrimes(i)) {
                count++;
            }
        }

        return count;
    }

    private static boolean isPrimes(int i) {
        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                return false;
            }
        }

        return true;
    }

}
