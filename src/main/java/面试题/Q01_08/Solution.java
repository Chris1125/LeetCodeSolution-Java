package 面试题.Q01_08;

import java.util.Arrays;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/zero-matrix-lcci/">零矩阵</a>
 * Difficulty: Medium
 * Status: Solved
 * @since 2020-09-22
 */
public class Solution {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        setZeroes(matrix);

        System.out.println(Arrays.deepToString(matrix));
    }

    public static void setZeroes(int[][] matrix) {
        boolean[] col = new boolean[matrix.length];
        boolean[] row = new boolean[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    col[i] = true;
                    row[j] = true;
                }

            }

        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (col[i] || row[j]) {
                    matrix[i][j] = 0;
                }

            }

        }

    }

}
