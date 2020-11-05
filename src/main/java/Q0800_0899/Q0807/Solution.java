package Q0800_0899.Q0807;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/max-increase-to-keep-city-skyline/">保持城市天际线</a>
 * Difficulty: Medium
 * Status: Solved
 * @since 2020-10-09
 */
public class Solution {

    public static void main(String[] args) {
        int[][] grid = new int[][]{
                {3, 0, 8, 4},
                {2, 4, 5, 7},
                {9, 2, 6, 3},
                {0, 3, 1, 0}};

        System.out.println(maxIncreaseKeepingSkyline(grid));
    }

    public static int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] maxCol = new int[grid.length];
        int[] maxRow = new int[grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                maxCol[j] = Math.max(grid[i][j], maxCol[j]);
                maxRow[i] = Math.max(grid[i][j], maxRow[i]);
            }

        }

        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                sum = sum + Math.min(maxCol[i], maxRow[j]) - grid[i][j];
            }

        }

        return sum;
    }

}
