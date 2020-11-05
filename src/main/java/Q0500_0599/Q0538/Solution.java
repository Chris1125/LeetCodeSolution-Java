package Q0500_0599.Q0538;

import base.TreeNode;
import base.TreeNodeUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/convert-bst-to-greater-tree/">把二叉搜索树转换为累加树</a>
 * Difficulty: Medium
 * Status: Solved
 * Daily: 2020-09-21
 * @since 2020-09-21
 */
public class Solution {

    public static void main(String[] args) {
        Integer[] input = {4, 1, 6, 0, 2, 5, 7, null, null, null, 3, null, null, null, 8};
        TreeNode treeByLevelOrder = TreeNodeUtil.createTreeByLevelOrder(Arrays.stream(input).collect(Collectors.toList()));
        TreeNode treeNode = convertBST(treeByLevelOrder);

        System.out.println(TreeNodeUtil.levelOrderTraversal(treeNode, new ArrayList<>()));
    }

    static int sum;

    public static TreeNode convertBST(TreeNode root) {
        if (null == root) {
            return null;
        }

        if (null != root.right) {
            convertBST(root.right);
        }

        sum += root.val;
        root.val = sum;

        if (null != root.left) {
            convertBST(root.left);
        }

        return root;
    }

}
