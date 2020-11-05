package Q0600_0699.Q0617;

import base.TreeNode;
import base.TreeNodeUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/merge-two-binary-trees/">合并二叉树</a>
 * Difficulty: Easy
 * Status: Solved
 * Daily: 2020-09-23
 * @since 2020-09-08
 */
public class Solution {

    public static void main(String[] args) {
        // [1, 3, 2, 5]
        // [2, 1, 3, null, 4, null, 7]
        Integer[] input1 = {1, 3, 2, 5};
        Integer[] input2 = {2, 1, 3, null, 4, null, 7};
        TreeNode t1 = TreeNodeUtil.createTreeByPreOrder(Arrays.stream(input1).collect(Collectors.toList()));
        TreeNode t2 = TreeNodeUtil.createTreeByPreOrder(Arrays.stream(input2).collect(Collectors.toList()));

        System.out.println(TreeNodeUtil.levelOrderTraversal(mergeTrees(t1, t2), new ArrayList<>()));
    }

    public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (null == t1) {
            return t2;
        }

        if (null == t2) {
            return t1;
        }

        t1.val = t1.val + t2.val;
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);

        return t1;
    }

}
