package Q0500_0599.Q0529;

import java.util.Arrays;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/minesweeper">扫雷游戏</a>
 * Difficulty: Medium
 * Status: TODO
 * Daily: 2020-08-20
 * @since 2020-08-20
 */
public class Solution {

    public static void main(String[] args) {
        char[][] board = new char[][]{
                {'B', '1', 'E', '1', 'B'},
                {'B', '1', 'M', '1', 'B'},
                {'B', '1', '1', '1', 'B'},
                {'B', 'B', 'B', 'B', 'B'}};
        int[] click = new int[]{1, 2};

        System.out.println(Arrays.deepToString(updateBoard(board, click)));
    }

    public static char[][] updateBoard(char[][] board, int[] click) {
        return null;
    }

}
