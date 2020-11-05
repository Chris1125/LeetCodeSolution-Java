package Q1200_1299.Q1260;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/shift-2d-grid/">二维网格迁移</a>
 * Difficulty: Easy
 * Status: Solved
 * @since 2020-09-01
 */
public class Solution {

    public static void main(String[] args) {
        int[][] input = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println(shiftGrid(input, 1));
    }

    public static List<List<Integer>> shiftGrid(int[][] grid, int k) {
        while (k > 0) {
            int previous = grid[grid.length - 1][grid[0].length - 1];
            for (int row = 0; row < grid.length; row++) {
                for (int col = 0; col < grid[0].length; col++) {
                    int temp = grid[row][col];
                    grid[row][col] = previous;
                    previous = temp;
                }
            }

            k--;
        }

        List<List<Integer>> result = new ArrayList<>();
        for (int[] ints : grid) {
            result.add(Arrays.stream(ints).boxed().collect(Collectors.toList()));
        }

        return result;
    }

}
