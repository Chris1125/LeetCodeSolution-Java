package Q1300_1399.Q1356;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/sort-integers-by-the-number-of-1-bits/">根据数字二进制下 1 的数目排序</a>
 * Difficulty: Easy
 * Status: Solved
 * Daily: 2020-11-06
 * @since 2020-11-06
 */
public class Solution {

    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8};
//        int[] arr = new int[]{1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1};
//        int[] arr = new int[]{10000, 10000};
//        int[] arr = new int[]{2, 3, 5, 7, 11, 13, 17, 19};
//        int[] arr = new int[]{10, 100, 1000, 10000};

        System.out.println(Arrays.toString(sortByBits(arr)));
    }

    public static int[] sortByBits(int[] arr) {
        return Arrays.stream(arr).boxed()
                .sorted(Comparator.comparingInt(i -> Integer.bitCount(i) * 10000 + i))
                .mapToInt(i -> i).toArray();
    }

}
