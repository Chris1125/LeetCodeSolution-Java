package Q0900_0999.Q0973;

import java.util.Arrays;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/k-closest-points-to-origin/">最接近原点的 K 个点</a>
 * Difficulty: Medium
 * Status: TODO
 * Daily: 2020-11-09
 * @since 2020-09-29
 */
public class Solution {

    public static void main(String[] args) {
//        int[][] points = new int[][]{{1, 3}, {-2, 2}};
//        int k = 1;
        int[][] points = new int[][]{{3, 3}, {5, -1}, {-2, 4}};
        int k = 2;

        System.out.println(Arrays.deepToString(kClosest(points, k)));
    }

    public static int[][] kClosest(int[][] points, int K) {
        int[][] ints = new int[points.length][points[0].length];

        for (int[] point : points) {
            int length = point[0] * point[0] + point[1] * point[1];
        }

        return Arrays.copyOf(ints, K);
    }

}
