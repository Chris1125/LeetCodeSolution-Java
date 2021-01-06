package Q0400_0499.Q0435;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/non-overlapping-intervals/">无重叠区间</a>
 * Difficulty: Medium
 * Status: Solved
 * Daily: 2020-12-31
 * @since 2020-12-31
 */
public class Solution {

    public static void main(String[] args) {
//        int[][] intervals = new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 3}};
//        int[][] intervals = new int[][]{{1, 2}, {1, 2}, {1, 2}};
//        int[][] intervals = new int[][]{{1, 2}, {2, 3}};
//        int[][] intervals = new int[][]{};
        int[][] intervals = new int[][]{{1, 100}, {11, 22}, {1, 11}, {2, 12}};

        System.out.println(eraseOverlapIntervals(intervals));
    }

    public static int eraseOverlapIntervals(int[][] intervals) {
        if (null == intervals || intervals.length == 0) {
            return 0;
        }

        Arrays.sort(intervals, Comparator.comparingInt(o -> o[1]));

        int count = 1;
        int right = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= right) {
                count++;
                right = intervals[i][1];
            }
        }

        return intervals.length - count;
    }

}
