package Q0100_0199.Q0113;

import base.TreeNode;
import base.TreeNodeUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/path-sum-ii/">路径总和 II</a>
 * Difficulty: Medium
 * Status: Solved
 * Daily: 2020-09-26
 * @since 2020-09-26
 */
public class Solution {

    public static void main(String[] args) {
        Integer[] input = {5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1};
        TreeNode treeNode = TreeNodeUtil.createTreeByLevelOrder(Arrays.stream(input).collect(Collectors.toList()));

        System.out.println(pathSum(treeNode, 22));
    }

    public static List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<>();

        dfs(root, sum, new ArrayList<>(), result);

        return result;
    }

    public static void dfs(TreeNode root, int sum, List<Integer> list, List<List<Integer>> result) {
        if (root == null) {
            return;
        }

        list.add(root.val);
        if (null == root.left && null == root.right) {
            if (sum == root.val) {
                result.add(new ArrayList<>(list));
            }

            return;
        }

        if (null != root.left) {
            dfs(root.left, sum - root.val, list, result);
            list.remove(list.size() - 1);
        }

        if (null != root.right) {
            dfs(root.right, sum - root.val, list, result);
            list.remove(list.size() - 1);
        }

    }

}
