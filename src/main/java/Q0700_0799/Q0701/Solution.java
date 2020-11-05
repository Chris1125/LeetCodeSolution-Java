package Q0700_0799.Q0701;

import base.TreeNode;
import base.TreeNodeUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/insert-into-a-binary-search-tree/">二叉搜索树中的插入操作</a>
 * Difficulty: Medium
 * Status: Solved
 * Daily: 2020-09-30
 * @since 2020-09-30
 */
public class Solution {

    public static void main(String[] args) {
        Integer[] input = {4, 2, 7, 1, 3};
        TreeNode treeNode = TreeNodeUtil.createTreeByLevelOrder(Arrays.stream(input).collect(Collectors.toList()));

        int val = 5;

        System.out.println(TreeNodeUtil.levelOrderTraversal(insertIntoBST(treeNode, val), new ArrayList<>()));
    }

    public static TreeNode insertIntoBST(TreeNode root, int val) {
        if (null == root) {
            return new TreeNode(val);
        }

        if (val > root.val) {
            root.right = insertIntoBST(root.right, val);
        }

        if (val < root.val) {
            root.left = insertIntoBST(root.left, val);
        }

        return root;
    }

}