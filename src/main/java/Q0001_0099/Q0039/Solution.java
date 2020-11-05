package Q0001_0099.Q0039;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/combination-sum/">数组组合</a>
 * Difficulty: Medium
 * Status: Solved
 * Daily: 2020-09-09
 * @since 2020-09-09
 */
public class Solution {

    public static void main(String[] args) {
//        int[] candidates = new int[]{2, 3, 6, 7};
//        int target = 7;
        int[] candidates = new int[]{2, 3, 5};
        int target = 8;

        System.out.println(combinationSum(candidates, target));
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(0, candidates, target, new ArrayList<>(), result);

        return result;
    }

    private static void dfs(int index, int[] candidates, int target, List<Integer> list, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(list));
        }

        if (target < 0) {
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            if (target < candidates[i]) {
                continue;
            }

            list.add(candidates[i]);
            dfs(i, candidates, target - candidates[i], list, result);
            list.remove(list.size() - 1);
        }

    }

}
