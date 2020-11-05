package Q0400_0499.Q0404;

import base.TreeNode;
import base.TreeNodeUtil;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/sum-of-left-leaves/">左叶子之和</a>
 * Difficulty: Easy
 * Status: Solved
 * Daily: 2020-09-19
 * @since 2020-09-19
 */
public class Solution {

    public static void main(String[] args) {
//        Integer[] input = {3, 9, 20, null, null, 15, 7};
//        Integer[] input = {1, 2, 3, 4, 5};
        Integer[] input = {0, -4, -3, null, -1, 8, null, null, 3, null, -9, -2, null, 4};
        TreeNode treeNode = TreeNodeUtil.createTreeByLevelOrder(Arrays.stream(input).collect(Collectors.toList()));

        System.out.println(sumOfLeftLeaves(treeNode));
    }

    static int sum;

    public static int sumOfLeftLeaves(TreeNode root) {
        if (null == root) {
            return 0;
        }

        if (null != root.left) {
            if (null == root.left.left && null == root.left.right) {
                sum += root.left.val;
            }

            sumOfLeftLeaves(root.left);
        }

        if (null != root.right) {
            sumOfLeftLeaves(root.right);
        }

        return sum;
    }

}