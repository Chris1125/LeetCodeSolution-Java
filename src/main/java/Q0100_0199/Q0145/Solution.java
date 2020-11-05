package Q0100_0199.Q0145;

import base.TreeNode;
import base.TreeNodeUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/binary-tree-postorder-traversal/">二叉树的后序遍历</a>
 * Difficulty: Medium
 * Status: Solved
 * Daily: 2020-09-29
 * @since 2020-09-29
 */
public class Solution {

    public static void main(String[] args) {
        Integer[] input = {1, 2, 3, 4, 5, 6, 7};
        TreeNode treeNode = TreeNodeUtil.createTreeByLevelOrder(Arrays.stream(input).collect(Collectors.toList()));

        System.out.println(postorderTraversal(treeNode));
    }

    static final List<Integer> list = new ArrayList<>();

    public static List<Integer> postorderTraversal(TreeNode root) {
        recursion(root);

        return list;
    }

    public static void recursion(TreeNode root) {
        if (null != root) {
            recursion(root.left);
            recursion(root.right);
            list.add(root.val);
        }

    }

    public static void loop(TreeNode root) {
       // TODO
    }

}
