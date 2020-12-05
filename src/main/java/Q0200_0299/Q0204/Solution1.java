package Q0200_0299.Q0204;

/**
 * @author Chris
 * @description
 * @since 2020-12-03
 */
public class Solution1 {

    public static void main(String[] args) {
//        int n = 10;
        int n = 499979;

        System.out.println(n * n);
        System.out.println((long) n * n);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(countPrimes(n));
    }

    public static int countPrimes(int n) {
        int[] prime = new int[n];
        for (int i = 2; i < n; i++) {
            prime[i] = 1;
        }

        int count = 0;

        for (int i = 2; i < n; i++) {
            if (prime[i] == 1) {
                if ((long) i * i < n) {
                    for (int j = i * i; j < n; j += i) {
                        prime[j] = 0;
                    }
                }

                count++;
            }

        }

        return count;
    }

}
