package Q0100_0199.Q0112;

import base.TreeNode;
import base.TreeNodeUtil;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/path-sum/">路径总和</a>
 * Difficulty: Easy
 * Status: Solved
 * @since 2020-07-07
 */
public class Solution {

    public static void main(String[] args) {
        Integer[] input = {5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1};
        TreeNode treeNode = TreeNodeUtil.createTreeByLevelOrder(Arrays.stream(input).collect(Collectors.toList()));

        System.out.println(hasPathSum(treeNode, 22));
    }

    public static boolean hasPathSum(TreeNode root, int sum) {
        if (null == root) {
            return false;
        }

        if (null == root.left && null == root.right) {
            if (sum - root.val == 0) return true;

        }

        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }

}
