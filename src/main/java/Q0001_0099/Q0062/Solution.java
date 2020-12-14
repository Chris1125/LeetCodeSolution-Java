package Q0001_0099.Q0062;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/unique-paths/">不同路径</a>
 * Difficulty: Medium
 * Status: Solved
 * Daily: 2020-12-09
 * @since 2020-12-09
 */
public class Solution {

    public static void main(String[] args) {
        int m = 3;
        int n = 7;
        System.out.println(uniquePaths(m, n));
    }

    public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }

        for (int i = 0; i < n; i++) {
            dp[0][i] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
            }

        }

        return dp[m - 1][n - 1];
    }

}
