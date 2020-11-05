package Q0900_0999.Q0977;

import java.util.Arrays;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/squares-of-a-sorted-array/">有序数组的平方</a>
 * Difficulty: Easy
 * Status: Solved
 * Daily: 2020-10-16
 * @since 2020-10-16
 */
public class Solution {

    public static void main(String[] args) {
        int[] input = new int[]{-4, -1, 0, 3, 10};
//        int[] input = new int[]{0, 0, 0, 0, 0};
//        int[] input = new int[]{-7, -3, 2, 3, 11};

        System.out.println(Arrays.toString(sortedSquares(input)));
    }

    public static int[] sortedSquares(int[] A) {
        int[] res = new int[A.length];
        int start = 0;
        int end = A.length - 1;
        int index = A.length - 1;
        while (start <= end) {
            int temp;
            if (Math.abs(A[start]) >= Math.abs(A[end])) {
                temp = A[start] * A[start];
                start++;
            } else {
                temp = A[end] * A[end];
                end--;
            }

            res[index--] = temp;
        }

        return res;
    }

}
