package Q0001_0099.Q0037;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/sudoku-solver/">解数独</a>
 * Difficulty: Hard
 * Status: TODO
 * Daily: 2020-09-15
 * @since 2020-09-15
 */
public class Solution {

    public static void main(String[] args) {
        char[][] board = new char[][]{
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        solveSudoku(board);
    }

    public static void solveSudoku(char[][] board) {

    }

}
