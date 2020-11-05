package Q0500_0599.Q0530;

import base.TreeNode;
import base.TreeNodeUtil;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/minimum-absolute-difference-in-bst/">二叉搜索树的最小绝对差</a>
 * Difficulty: Easy
 * Status: Solved
 * Daily: 2020-10-12
 * @since 2020-10-12
 */
public class Solution {

    public static void main(String[] args) {
        Integer[] input = {4, 7, 9, 5, 10, 6, 11};
        TreeNode treeNode = TreeNodeUtil.createTreeByLevelOrder(Arrays.stream(input).collect(Collectors.toList()));

        System.out.println(getMinimumDifference(treeNode));
    }

    static int pre;
    static int ans;

    public static int getMinimumDifference(TreeNode root) {
        ans = Integer.MAX_VALUE;
        pre = -1;
        dfs(root);

        return ans;
    }

    public static void dfs(TreeNode root) {
        if (root == null) {
            return;
        }

        dfs(root.left);
        if (pre != -1) {
            ans = Math.min(ans, Math.abs(root.val - pre));
        }

        pre = root.val;

        dfs(root.right);
    }

}
