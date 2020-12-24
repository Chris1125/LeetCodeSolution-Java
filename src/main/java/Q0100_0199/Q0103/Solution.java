package Q0100_0199.Q0103;

import base.TreeNode;
import base.TreeNodeUtil;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/binary-tree-zigzag-level-order-traversal">二叉树的锯齿形层序遍历</a>
 * Difficulty: Medium
 * Status: Solved
 * Daily: 2020-12-22
 * @since 2020-12-22
 */
public class Solution {

    public static void main(String[] args) {
//        Integer[] input = {3, 9, 20, null, null, 15, 7};
        Integer[] input = {1, 2, 3, 4, null, null, 5};
        TreeNode root = TreeNodeUtil.createTreeByLevelOrder(Arrays.stream(input).collect(Collectors.toList()));

        System.out.println(zigzagLevelOrder(root));
    }

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> resList = new ArrayList<>();

        Deque<TreeNode> deque = new LinkedList<>();
        boolean leftToRight = false;

        deque.offer(root);

        while (!deque.isEmpty()) {
            int size = deque.size();

            LinkedList<Integer> list = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode poll = deque.poll();
                if (leftToRight) {
                    list.addFirst(poll.val);
                } else {
                    list.addLast(poll.val);

                }

                if (null != poll.left) {
                    deque.offer(poll.left);
                }

                if (null != poll.right) {
                    deque.offer(poll.right);
                }

            }

            resList.add(list);
            leftToRight = !leftToRight;
        }

        return resList;
    }

}
