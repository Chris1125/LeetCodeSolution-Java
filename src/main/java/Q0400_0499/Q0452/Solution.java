package Q0400_0499.Q0452;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/minimum-number-of-arrows-to-burst-balloons/">用最少数量的箭引爆气球</a>
 * Difficulty: Medium
 * Status: Solved
 * Daily: 2020-11-23
 * @since 2020-11-23
 */
public class Solution {

    public static void main(String[] args) {
//        int[][] points = new int[][]{{10, 16}, {2, 8}, {1, 6}, {7, 12}};
//        int[][] points = new int[][]{};
//        int[][] points = new int[][]{{1, 9}, {7, 16}, {2, 5}, {7, 12}, {9, 11}, {2, 10}, {9, 16}, {3, 9}, {1, 3}};
        int[][] points = new int[][]{{9, 12}, {1, 10}, {4, 11}, {8, 12}, {3, 9}, {6, 9}, {6, 7}};

        System.out.println(findMinArrowShots(points));
    }

    public static int findMinArrowShots(int[][] points) {
        if (null == points || points.length == 0) {
            return 0;
        }

        Arrays.sort(points, Comparator.comparingInt(point -> point[1]));

        int temp = points[0][1];
        int res = 1;
        for (int[] point : points) {
            if (point[0] > temp) {
                res++;
                temp = point[1];
            }

        }

        return res;
    }

}
