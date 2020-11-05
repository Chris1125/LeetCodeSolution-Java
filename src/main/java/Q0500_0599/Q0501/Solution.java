package Q0500_0599.Q0501;

import base.TreeNode;
import base.TreeNodeUtil;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/find-mode-in-binary-search-tree/">二叉搜索树中的众数</a>
 * Difficulty: Easy
 * Status: Solved
 * Daily: 2020-09-24
 * @since 2020-09-24
 */
public class Solution {
public static void main(String[] args) {
        Integer[] input = {1, null, 2, 2};
        List<Integer> collect = Arrays.stream(input).collect(Collectors.toList());
        TreeNode treeNode = TreeNodeUtil.createTreeByLevelOrder(collect);

        System.out.println(Arrays.toString(findMode(treeNode)));
    }

    static final Map<Integer, Integer> countMap = new HashMap<>();
    static int maxCount = 0;

    public static int[] findMode(TreeNode root) {
        bfs(root);

        int[] result = new int[countMap.size()];
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == maxCount) {
                result[index++] = entry.getKey();
            }

        }

        return Arrays.copyOf(result, index);
    }

    private static void bfs(TreeNode root) {
        if (null != root) {
            int count = countMap.getOrDefault(root.val, 0) + 1;
            maxCount = Math.max(count, maxCount);
            countMap.put(root.val, count);

            if (null != root.left) {
                bfs(root.left);
            }

            if (null != root.right) {
                bfs(root.right);
            }

        }

    }

}
