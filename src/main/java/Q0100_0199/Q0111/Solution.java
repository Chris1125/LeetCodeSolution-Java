package Q0100_0199.Q0111;

import base.TreeNode;
import base.TreeNodeUtil;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/minimum-depth-of-binary-tree/">二叉树的最小深度</a>
 * Difficulty: Easy
 * Status: Solved
 * Daily: 2020-08-21
 * @since 2020-08-21
 */
public class Solution {
    public static void main(String[] args) {
        Integer[] input = {3, 9, 20, 15, 7};
        TreeNode treeNode = TreeNodeUtil.createTreeByLevelOrder(Arrays.stream(input).collect(Collectors.toList()));

        System.out.println(minDepth(treeNode));
    }

    public static int minDepth(TreeNode root) {
        if (null == root) {
            return 0;
        }

        if (null == root.left || null == root.right) {
            return 1;
        }

        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }

}
