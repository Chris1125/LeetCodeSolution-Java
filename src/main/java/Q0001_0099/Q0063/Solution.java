package Q0001_0099.Q0063;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/unique-paths-ii/">不同路径 II</a>
 * Difficulty: Medium
 * Status: Solved
 * @since 2020-07-06
 */
public class Solution {

    public static void main(String[] args) {
        int[][] input = new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        int result = uniquePathsWithObstacles(input);

        System.out.println(result);
    }

    private static int uniquePathsWithObstacles(int[][] input) {
        int m = input.length;
        int n = input[0].length;

        int[][] result = new int[m][n];

        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (input[i][j] == 1) {
                    result[i][j] = 0;
                    continue;
                }

                if (i == 0 && j == 0) {
                    result[0][0] = input[0][0] == 0 ? 1 : 0;
                } else if (i == 0) {
                    result[i][j] = result[i][j - 1];
                } else if (j == 0) {
                    result[i][j] = result[i - 1][j];
                } else {
                    result[i][j] = result[i - 1][j] + result[i][j - 1];
                }

            }

        }

        return result[m - 1][n - 1];
    }

}
