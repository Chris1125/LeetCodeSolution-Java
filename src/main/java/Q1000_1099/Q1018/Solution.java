package Q1000_1099.Q1018;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/binary-prefix-divisible-by-5/">可被 5 整出的二进制前缀</a>
 * Difficulty: Easy
 * Status: Solved
 * @since 2020-09-18
 */
public class Solution {
    public static void main(String[] args) {
//        int[] input = new int[]{0, 1, 1};
//        int[] input = new int[]{1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 1};
        int[] input = new int[]{1, 0, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0};

        System.out.println(prefixesDivBy5(input));
    }

    public static List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> result = new ArrayList<>();

        int temp = 0;
        for (int i : A) {
            temp = ((temp << 1) + i) % 5;
            result.add(temp == 0);
        }

        return result;
    }

}
