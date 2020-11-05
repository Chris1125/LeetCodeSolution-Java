package Q0001_0099.Q0078;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/subsets/">子集</a>
 * Difficulty: Medium
 * Status: Solved
 * Daily: 2020-09-20
 * @since 2020-09-17
 */
public class Solution {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3};

        System.out.println(subsets(nums));
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i <= nums.length; i++) {
            backtrack(i, 0, nums, result, new ArrayList<>());
        }

        return result;
    }

    private static void backtrack(int i, int index, int[] nums, List<List<Integer>> result, ArrayList<Integer> list) {
        if (list.size() == i) {
            result.add(new ArrayList<>(list));
            return;
        }

        for (int j = index; j < nums.length; j++) {
            list.add(nums[j]);
            backtrack(i, j + 1, nums, result, list);
            list.remove(list.size() - 1);
        }

    }

}