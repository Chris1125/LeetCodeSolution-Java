package Q0001_0099.Q0094;

import base.TreeNode;
import base.TreeNodeUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/binary-tree-inorder-traversal/">二叉树的中序遍历</a>
 * Difficulty: Medium
 * Status: Solved
 * Daily: 2020-09-14
 * @since 2020-09-14
 */
public class Solution {

    public static void main(String[] args) {
        Integer[] input = {1, null, 2, 3};
        TreeNode treeNode = TreeNodeUtil.createTreeByLevelOrder(Arrays.stream(input).collect(Collectors.toList()));

        System.out.println(inorderTraversal(treeNode));
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        loop(root, result);

        return result;
    }

    public static void recursion(TreeNode root, List<Integer> list) {
        if (null == root) {
            return;
        }

        if (null != root.left) {
            recursion(root.left, list);
        }

        list.add(root.val);

        if (null != root.right) {
            recursion(root.right, list);
        }

    }

    private static void loop(TreeNode root, List<Integer> list) {
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();
            list.add(root.val);
            root = root.right;
        }

    }

}
