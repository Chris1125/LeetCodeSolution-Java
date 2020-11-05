package 剑指Offer.Q04;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof/">二维数组中的查找</a>
 * Difficulty: Easy
 * Status: Solved
 * @since 2020-10-15
 */
public class Solution {

    public static void main(String[] args) {
//        int[][] matrix = new int[][]{{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
//        int target = 5;
        int[][] matrix = new int[][]{{-5}};
        int target = -5;

        System.out.println(findNumberIn2DArray(matrix, target));
    }

    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (null == matrix) {
            return false;
        }

        int rows = matrix.length;
        if (rows == 0) {
            return false;
        }

        int cols = matrix[0].length;
        if (cols == 0) {
            return false;
        }

        if (target < matrix[0][0] || target > matrix[rows - 1][cols - 1]) {
            return false;
        }

        int row = 0;
        int col = cols - 1;

        while (row < rows && col >= 0) {
            int temp = matrix[row][col];

            if (temp == target) {
                return true;
            } else if (temp > target) {
                col--;
            } else {
                row++;
            }

        }

        return false;
    }

}
