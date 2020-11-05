package Q0600_0699.Q0637;

import base.TreeNode;
import base.TreeNodeUtil;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/average-of-levels-in-binary-tree/">二叉树的层平均值</a>
 * Difficulty: Easy
 * Status: Solved
 * Daily: 2020-09-12
 * @since 2020-09-12
 */
public class Solution {

    public static void main(String[] args) {
        Integer[] input = {2147483647, 2147483647, 2147483647};
        TreeNode treeByLevelOrder = TreeNodeUtil.createTreeByLevelOrder(Arrays.stream(input).collect(Collectors.toList()));

        System.out.println(averageOfLevels(treeByLevelOrder));
    }

    public static List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            double sum = 0.0;
            double count = 0.0;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                sum += node.val;
                count++;
                if (node.left != null) {
                    queue.offer(node.left);
                }

                if (node.right != null) {
                    queue.offer(node.right);
                }

            }

            result.add(sum / count);
        }

        return result;
    }

}
