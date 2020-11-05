package Q0100_0199.Q0129;

import base.TreeNode;
import base.TreeNodeUtil;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/sum-root-to-leaf-numbers/">求根到叶子节点数字之和</a>
 * Difficulty: Medium
 * Status: Solved
 * Daily: 2020-10-29
 * @since 2020-10-29
 */
public class Solution {

    public static void main(String[] args) {
        Integer[] input = {1, 2, 3};
        TreeNode treeNode = TreeNodeUtil.createTreeByLevelOrder(Arrays.stream(input).collect(Collectors.toList()));

        System.out.println(sumNumbers(treeNode));
    }

    public static int sumNumbers(TreeNode root) {
        return dfs(root, 0);
    }

    public static int dfs(TreeNode root, int sum) {
        if (null != root) {
            sum = sum * 10 + root.val;
            if (null == root.left && null == root.right) {
                return sum;
            } else {
                return dfs(root.left, sum) + dfs(root.right, sum);
            }

        }

        return 0;
    }

}
