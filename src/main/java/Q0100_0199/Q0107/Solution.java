package Q0100_0199.Q0107;

import base.TreeNode;
import base.TreeNodeUtil;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/binary-tree-level-order-traversal-ii"/">二叉树的层序遍历II</a>
 * Difficulty: Easy
 * Status: Solved
 * Daily: 2020-09-06
 * @since 2020-09-06
 */
public class Solution {

    public static void main(String[] args) {
        Integer[] input = {3, 9, 20, 15, 7};
        TreeNode treeNode = TreeNodeUtil.createTreeByLevelOrder(Arrays.stream(input).collect(Collectors.toList()));

        System.out.println(levelOrderBottom(treeNode));
    }

    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> subList = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                subList.add(poll.val);
                if (null != poll.left){
                    queue.offer(poll.left);
                }

                if (null != poll.right) {
                    queue.offer(poll.right);
                }

            }

            list.add(0, subList);
        }

        return list;
    }

}
