package Q0100_0199.Q0104;

import base.TreeNode;
import base.TreeNodeUtil;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/">二叉树的最大深度</a>
 * Difficulty: Easy
 * Status: Solved
 * @since 2020-09-08
 */
public class Solution {

    public static void main(String[] args) {
//        Integer[] input = {3, 9, 20, null, null, 15, 7};
        Integer[] input = {3};
        TreeNode treeNode = TreeNodeUtil.createTreeByLevelOrder(Arrays.stream(input).collect(Collectors.toList()));

        System.out.println(maxDepth(treeNode));
    }

    public static int maxDepth(TreeNode root) {
        if (null == root) {
            return 0;
        }

        int leftHeight = maxDepth(root.left) + 1;
        int rightHeight = maxDepth(root.right) + 1;

        return Math.max(leftHeight, rightHeight);
    }

}
