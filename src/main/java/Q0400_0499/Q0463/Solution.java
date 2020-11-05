package Q0400_0499.Q0463;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/island-perimeter/">岛屿的周长</a>
 * Difficulty: Easy
 * Status: Solved
 * Daily: 2020-10-30
 * @since 2020-10-30
 */
public class Solution {

    public static void main(String[] args) {
        int[][] grid = new int[][]{{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}};
//        int[][] grid = new int[][]{{1, 1}, {1, 1}};

        System.out.println(islandPerimeter(grid));
    }

    public static int islandPerimeter(int[][] grid) {
        int near = 0;
        int island = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                island += grid[i][j];
                near = near + near(grid, i, j);
            }

        }

        return 4 * island - 2 * near;
    }

    private static int near(int[][] grid, int i, int j) {
        if (grid[i][j] == 0) {
            return 0;
        }

        int near = 0;

        if (i != 0 && grid[i - 1][j] == 1) {
            near++;
        }

        if (j != 0 && grid[i][j - 1] == 1) {
            near++;
        }

        return near;
    }

}
