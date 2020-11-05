package Q0900_0999.Q0941;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/valid-mountain-array/">有效的山脉数组</a>
 * Difficulty: Easy
 * Status: Solved
 * Daily: 2020-11-03
 * @since 2020-11-03
 */
public class Solution {

    public static void main(String[] args) {
        int[] input = new int[]{1, 9, 6, 4, 2, 1};

        System.out.println(validMountainArray(input));
    }

    public static boolean validMountainArray(int[] A) {
        int start = 0;
        int end = A.length;
        while (start < end && A[start] < A[start + 1]) {
            start++;
        }

        if (start == 0 || start == end - 1) {
            return false;
        }

        while (start + 1 < end && A[start] > A[start + 1]) {
            start++;
        }

        return start == end - 1;
    }

}
