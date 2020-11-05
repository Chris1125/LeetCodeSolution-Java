package Q1000_1099.Q1037;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/valid-boomerang/">有效的回旋镖</a>
 * Difficulty: Easy
 * Status: Solved
 * @since 2020-08-31
 */
public class Solution {

    public static void main(String[] args) {
        int[][] points = new int[][]{{1, 1}, {2, 2}, {3, 3}};

        System.out.println(isBoomerang(points));
    }

    public static boolean isBoomerang(int[][] points) {
        return (points[2][0] - points[1][0]) * (points[1][1] - points[0][1]) == (points[1][0] - points[0][0]) * (points[2][1] - points[1][1]);
    }

}
