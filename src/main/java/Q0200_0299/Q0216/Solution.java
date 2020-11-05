package Q0200_0299.Q0216;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/combination-sum-iii/">组合总和 III</a>
 * Difficulty: Medium
 * Status: Solved
 * Daily: 2020-09-11
 * @since 2020-09-11
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(combinationSum3(3, 9));
    }

    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        dfs(1, k, n, list, result);

        return result;
    }

    private static void dfs(int index, int count, int sum, List<Integer> list, List<List<Integer>> result) {
        if (count == 0 && sum == 0) {
            result.add(new ArrayList<>(list));
            return;
        }

        for (int i = index; i < 10; i++) {
            list.add(i);
            dfs(i + 1, count - 1, sum - i, list, result);
            list.remove(list.size() - 1);
        }

    }

}
