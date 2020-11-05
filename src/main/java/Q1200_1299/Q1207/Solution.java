package Q1200_1299.Q1207;

import java.util.*;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/unique-number-of-occurrences/">独一无二的出现次数</a>
 * Difficulty: Easy
 * Status: Solved
 * Daily: 2020-10-28
 * @since 2020-10-28
 */
public class Solution {

    public static void main(String[] args) {
        int[] input = new int[]{1, 2, 2, 1, 1, 3};
//        int[] input = new int[]{1, 2, 2, 1};
//        int[] input = new int[]{-1000, 1000};
//        int[] input = new int[]{};

        System.out.println(uniqueOccurrences(input));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int i : arr) {
            countMap.put(i, countMap.getOrDefault(i, 0) + 1);
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            Integer count = entry.getValue();
            if (map.containsKey(count)) {
                return false;
            }

            map.put(count, count);
        }

        return true;
    }

}