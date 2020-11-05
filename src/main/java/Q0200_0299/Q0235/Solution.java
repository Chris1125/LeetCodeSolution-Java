package Q0200_0299.Q0235;

import base.TreeNode;
import base.TreeNodeUtil;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-search-tree/">二叉搜索树的最近公共祖先</a>
 * Difficulty: Easy
 * Status: TODO
 * Daily: 2020-09-27
 * @since 2020-09-27
 */
public class Solution {

    public static void main(String[] args) {
//        Integer[] input = {6,2,8,0,4,7,9,null,null,3,5};
//        int p = 2;
//        int q = 8;
        Integer[] input = {6, 2, 8, 0, 4, 7, 9, null, null, 3, 5};
        int p = 2;
        int q = 4;
        List<Integer> collect = Arrays.stream(input).collect(Collectors.toList());
        TreeNode treeNode = TreeNodeUtil.createTreeByLevelOrder(collect);
        TreeNode treeNodeP = new TreeNode();
        treeNodeP.val = p;
        TreeNode treeNodeQ = new TreeNode();
        treeNodeQ.val = q;

        System.out.println(lowestCommonAncestor(treeNode, treeNodeP, treeNodeQ).val);
    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return null;
    }
}
