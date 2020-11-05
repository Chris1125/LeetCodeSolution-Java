package 剑指Offer.Q07;

import base.TreeNode;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/zhong-jian-er-cha-shu-lcof/">重建二叉树</a>
 * Difficulty: Medium
 * Status: TODO
 * @since 2020-10-15
 */
public class Solution {

    public static void main(String[] args) {
        int[] preorder = {1, 2, 4, 8, 9, 5, 10, 11, 3, 6, 12, 13, 7, 14, 15};
        int[] inorder = {8, 4, 9, 2, 10, 5, 11, 1, 12, 6, 13, 3, 14, 7, 15};

        System.out.println(buildTree(preorder, inorder));
    }

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        return null;
    }

}
