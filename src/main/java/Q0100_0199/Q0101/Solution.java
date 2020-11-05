package Q0100_0199.Q0101;

import base.Node;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/populating-next-right-pointers-in-each-node/">填充每个节点的下一个右侧节点指针</a>
 * Difficulty: Medium
 * Status: Solved
 * Daily: 2020-10-15
 * @since 2020-10-15
 */
public class Solution {

    /**
     * 迭代解法，层序遍历
     */
    public static Node connect(Node root) {
        if (null == root) return null;

        Deque<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node poll = queue.poll();
                if (i < size - 1) {
                    poll.next = queue.peek();
                }

                if (poll.left != null) {
                    queue.add(poll.left);
                }

                if (poll.right != null) {
                    queue.add(poll.right);
                }

            }

        }

        return root;
    }

}
