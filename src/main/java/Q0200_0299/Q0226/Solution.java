package Q0200_0299.Q0226;

import base.TreeNode;
import base.TreeNodeUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/invert-binary-tree/">翻转二叉树</a>
 * Difficulty: Easy
 * Status: Solved
 * Daily: 2020-09-16
 * @since 2020-09-08
 */
public class Solution {

    public static void main(String[] args) {
        Integer[] input = {1, 7, 3, 4, 5, 6, 7};
        TreeNode treeNode = TreeNodeUtil.createTreeByLevelOrder(Arrays.stream(input).collect(Collectors.toList()));

        System.out.println(TreeNodeUtil.preorderTraversal(invertTree(treeNode), new ArrayList<>()));
    }

    public static TreeNode invertTree(TreeNode root) {
        if (null == root) {
            return null;
        }

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        if (null != root.left) {
            invertTree(root.left);
        }

        if (null != root.right){
            invertTree(root.right);
        }

        return root;
    }

}
