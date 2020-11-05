package Q0001_0099.Q0040;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/combination-sum-ii/">组合总和 II</a>
 * Difficulty: Medium
 * Status: Solved
 * Daily: 2020-09-10
 * @since 2020-09-10
 */
public class Solution {

    public static void main(String[] args) {
//        int[] candidates = new int[]{10, 1, 2, 7, 6, 1, 5};
//        int target = 8;
        int[] candidates = new int[]{14, 6, 25, 9, 30, 20, 33, 34, 28, 30, 16, 12, 31, 9, 9, 12, 34, 16, 25, 32, 8, 7, 30, 12, 33, 20, 21, 29, 24, 17, 27, 34, 11, 17, 30, 6, 32, 21, 27, 17, 16, 8, 24, 12, 12, 28, 11, 33, 10, 32, 22, 13, 34, 18, 12};
        int target = 27;

        System.out.println(combinationSum2(candidates, target));
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(0, candidates, target, new ArrayList<>(), result);

        return result;
    }

    private static void dfs(int index, int[] candidates, int target, List<Integer> solution, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(solution));
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            if (target - candidates[i] < 0) {
                continue;
            }

            if (i > index && candidates[i] == candidates[i - 1]) {
                continue;
            }

            solution.add(candidates[i]);
            dfs(i + 1, candidates, target - candidates[i], solution, result);
            solution.remove(solution.size() - 1);
        }

    }

}
