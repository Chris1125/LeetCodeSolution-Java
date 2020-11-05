package Q0001_0099.Q0047;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/permutations-ii/">全排列 II</a>
 * Difficulty: Medium
 * Status: Solved
 * Daily: 2020-09-18
 * @since 2020-09-18
 */
public class Solution {

    public static void main(String[] args) {
//        int[] nums = new int[]{1, 2, 3};
//        int[] nums = new int[]{1, 2, 1};
        int[] nums = new int[]{2, 1, 1,};

        System.out.println(permuteUnique(nums));
    }

    static boolean[] visit;

    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        visit = new boolean[nums.length];
        Arrays.sort(nums);

        backtrack(0, nums, new ArrayList<>(), result);

        return result;
    }

    public static void backtrack(int index, int[] nums, List<Integer> list, List<List<Integer>> result) {
        if (list.size() == nums.length) {
            result.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (visit[i] || (i > 0 && nums[i] == nums[i - 1] && !visit[i - 1])) {
                continue;
            }

            list.add(nums[i]);
            visit[i] = true;
            backtrack(index + 1, nums, list, result);
            visit[i] = false;
            list.remove(list.size() - 1);
        }

    }

}
