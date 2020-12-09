package Q0100_0199.Q0118;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/pascals-triangle/">杨辉三角</a>
 * Difficulty: Easy
 * Status: Solved
 * Daily:2020-12-06
 * @since 2020-12-06
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(generate(5));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> resList = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    list.add(1);
                } else {
                    list.add(resList.get(i - 1).get(j - 1) + resList.get(i - 1).get(j));
                }

            }

            resList.add(list);
        }

        return resList;
    }

}
