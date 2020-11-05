package Q0900_0999.Q0968;

import base.TreeNode;
import base.TreeNodeUtil;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/binary-tree-cameras/">监控二叉树</a>
 * Difficulty: Hard
 * Status: TODO
 * Daily: 2020-09-22
 * @since 2020-09-22
 */
public class Solution {

    public static void main(String[] args) {
        Integer[] input = {0, 0, null, 0, 0};
//        Integer[] input = {0, 0, null, 0, null, 0, null, null, 0};
        TreeNode treeNode = TreeNodeUtil.createTreeByLevelOrder(Arrays.stream(input).collect(Collectors.toList()));

        System.out.println(minCameraCover(treeNode));
    }

    public static int minCameraCover(TreeNode root) {
        return 0;
    }

}
