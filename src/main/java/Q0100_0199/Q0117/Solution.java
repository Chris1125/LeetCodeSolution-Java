package Q0100_0199.Q0117;

import base.Node;
import base.NodeUtil;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Collectors;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/populating-next-right-pointers-in-each-node-ii/">填充每个节点的下一个右侧节点指针 II</a>
 * Difficulty: Medium
 * Status: Solved
 * Daily: 2020-09-28
 * @since 2020-09-28
 */
public class Solution {

    public static void main(String[] args) {
        Integer[] input = {1, 2, 3, 4, 5, null, 7};
        Node node = NodeUtil.createTreeByLevelOrder(Arrays.stream(input).collect(Collectors.toList()));
        Node connect = connect(node);

        System.out.println(connect);
    }

    public static Node connect(Node root) {
        if (null == root) {
            return null;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            Node pre = null;

            for (int i = 0; i < size; i++) {
                Node poll = queue.poll();
                if (poll.left != null) {
                    queue.offer(poll.left);
                }

                if (poll.right != null) {
                    queue.offer(poll.right);
                }

                if (i != 0) {
                    pre.next = poll;
                }

                pre = poll;
            }

        }

        return root;
    }

}
