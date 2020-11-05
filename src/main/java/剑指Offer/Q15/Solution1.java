package 剑指Offer.Q15;

/**
 * @author Chris
 * @description
 * @since 2020-09-02
 */
public class Solution1 {

    public static void main(String[] args) {
        int n = 118;

        System.out.println(hammingWeight(n));
    }

    public static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n & (n - 1);
        }

        return count;
    }

}
