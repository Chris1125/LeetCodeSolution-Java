package Q0100_0199.Q0144;

import base.TreeNode;
import base.TreeNodeUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/binary-tree-preorder-traversal/">二叉树的前序遍历</a>
 * Difficulty: Medium
 * Status: Solved
 * Daily: 2020-10-27
 * @since 2020-10-27
 */
public class Solution {

    public static void main(String[] args) {
        Integer[] input = {1, 2, 3, 4, 5};
        TreeNode root = TreeNodeUtil.createTreeByLevelOrder(Arrays.stream(input).collect(Collectors.toList()));

        System.out.println(inorderTraversal(root));
    }

    public static final List<Integer> resList = new ArrayList<>();

    public static List<Integer> inorderTraversal(TreeNode root) {
        if (null == root) {
            return resList;
        }

        resList.add(root.val);
        inorderTraversal(root.left);
        inorderTraversal(root.right);

        return resList;
    }

}
