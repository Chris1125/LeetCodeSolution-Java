package Q0001_0099.Q0079;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/word-search/">单词搜索</a>
 * Difficulty: Medium
 * Status: TODO
 * Daily: 2020-09-13
 * @since 2020-09-13
 */
public class Solution {

    public static void main(String[] args) {
//        char[][] board = new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
//        String word = "ABCB";
//        char[][] board = new char[][]{{'A'}};
//        String word = "AB";
        char[][] board = new char[][]{{'A', 'B'}, {'C', 'D'}};
        String word = "CDBA";

        System.out.println(exist(board, word));
    }

    public static boolean exist(char[][] board, String word) {
        return false;
    }

}
