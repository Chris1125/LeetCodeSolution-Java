package Q0900_0999.Q0922;

import java.util.Arrays;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/sort-array-by-parity-ii/">按奇偶排序数组 II</a>
 * Difficulty: Easy
 * Status: Solved
 * Daily: 2020-11-12
 * @since 2020-11-12
 */
public class Solution {

    public static void main(String[] args) {
//        int[] input = new int[]{4, 2, 5, 7};
        int[] input = new int[]{};

        System.out.println(Arrays.toString(sortArrayByParityII(input)));
    }

    public static int[] sortArrayByParityII(int[] A) {
        int[] res = new int[A.length];

        int oddIndex = 1;
        int evenIndex = 0;

        for (int i : A) {
            if (i % 2 == 0) {
                res[evenIndex] = i;
                evenIndex = evenIndex + 2;
            } else {
                res[oddIndex] = i;
                oddIndex = oddIndex + 2;
            }

        }

        return res;
    }

}
