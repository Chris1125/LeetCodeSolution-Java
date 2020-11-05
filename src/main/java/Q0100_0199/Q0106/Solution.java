package Q0100_0199.Q0106;

import base.TreeNode;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/">从中序与后序遍历序列构造二叉树</a>
 * Difficulty: Medium
 * Status: TODO
 * Daily: 2020-09-25
 * @since 2020-09-25
 */
public class Solution {

    public static void main(String[] args) {
        int[] inorder = new int[]{9, 3, 15, 20, 7};
        int[] postorder = new int[]{9, 15, 7, 20, 3};

        System.out.println(buildTree(inorder,postorder));
    }

    public static  TreeNode buildTree(int[] inorder, int[] postorder) {
        return null;
    }

}
