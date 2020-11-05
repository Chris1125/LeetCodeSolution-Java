package Q0200_0299.Q0257;

import base.TreeNode;
import base.TreeNodeUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/binary-tree-paths/">二叉树的所有路径</a>
 * Difficulty: Easy
 * Status: Solved
 * Daily: 2020-09-04
 * @since 2020-09-04
 */
public class Solution {

    public static void main(String[] args) {
        Integer[] input = {1, 2, 3, null, 5};
        TreeNode treeNode = TreeNodeUtil.createTreeByLevelOrder(Arrays.stream(input).collect(Collectors.toList()));
        System.out.println(binaryTreePaths(treeNode));
    }

    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        dfs(root, "", list);
        return list;
    }

    public static void dfs(TreeNode node, String s, List<String> list) {
        if (null == node) {
            return;
        }

        StringBuilder sb = new StringBuilder(s);
        sb.append(node.val);

        if (null == node.left && null == node.right) {
            list.add(sb.toString());
            return;
        }

        sb.append("->");
        dfs(node.left, sb.toString(), list);
        dfs(node.right, sb.toString(), list);
    }

}
