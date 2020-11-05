package Q0001_0099.Q0077;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/combinations/">组合</a>
 * Difficulty: Medium
 * Status: Solved
 * Daily: 2020-09-08
 * @since 2020-09-08
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(combine(1, 1));
    }

    public static List<List<Integer>> combine(int n, int k) {
        if (n <= 0 || k > n)  {
            return new ArrayList<>();
        }

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        dfs(0, list, result, n, k);

        return result;
    }

    private static void dfs(int index, List<Integer> list, List<List<Integer>> result, int n, int k) {
        if (list.size() == k) {
            result.add(new ArrayList<>(list));
            return;
        }

        for (int i = index; i <= (n - (k - list.size())); i++) {
            list.add(i + 1);
            dfs(i + 1, list, result, n, k);
            list.remove(list.size() - 1);
        }

    }

}
