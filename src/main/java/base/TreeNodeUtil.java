package base;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Chris
 * @description
 * @since 2020-08-18
 */
public class TreeNodeUtil {

    /**
     * 前序遍历创建二叉树
     */
    public static TreeNode createTreeByPreOrder(List<Integer> list) {
        TreeNode treeNode = null;
        if (null == list || list.size() == 0) return null;

        Integer remove = list.remove(0);
        if (null != remove) {
            treeNode = new TreeNode();
            treeNode.val = remove;
            treeNode.left = createTreeByPreOrder(list);
            treeNode.right = createTreeByPreOrder(list);
        }

        return treeNode;
    }

    /**
     * 层序遍历创建二叉树
     */
    public static TreeNode createTreeByLevelOrder(List<Integer> input) {
        if (input.size() == 0) return null;
        TreeNode root = new TreeNode();
        root.val = input.remove(0);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (input.size() > 0) {
            TreeNode current = queue.poll();

            if (input.size() > 0) {
                Integer remove = input.remove(0);
                if (null != remove) {
                    current.left = new TreeNode();
                    current.left.val = remove;
                    queue.offer(current.left);
                }
            }

            if (input.size() > 0) {
                Integer remove = input.remove(0);
                if (null != remove) {
                    current.right = new TreeNode();
                    current.right.val = remove;
                    queue.offer(current.right);
                }

            }

        }

        return root;
    }

    /**
     * 前序遍历
     */
    public static List<Integer> preorderTraversal(TreeNode treeNode, List<Integer> list) {
        if (null != treeNode) {
            list.add(treeNode.val);
            preorderTraversal(treeNode.left, list);
            preorderTraversal(treeNode.right, list);
        }

        return list;
    }

    /**
     * 中序遍历
     */
    public static List<Integer> inorderTraversal(TreeNode treeNode, List<Integer> list) {
        if (null != treeNode) {
            inorderTraversal(treeNode.left, list);
            list.add(treeNode.val);
            inorderTraversal(treeNode.right, list);
        }

        return list;
    }

    /**
     * 后序遍历
     */
    public static List<Integer> postorderTraversal(TreeNode treeNode, List<Integer> list) {
        if (null != treeNode) {
            postorderTraversal(treeNode.left, list);
            postorderTraversal(treeNode.right, list);
            list.add(treeNode.val);
        }

        return list;
    }

    /**
     * 层序遍历
     */
    public static List<Integer> levelOrderTraversal(TreeNode treeNode, List<Integer> list) {
        Deque<TreeNode> deque = new LinkedList<>();
        deque.offer(treeNode);
        while (!deque.isEmpty()) {
            int size = deque.size();
            for (int i = 0; i < size; i++) {
                TreeNode poll = deque.poll();
                list.add(poll.val);
                if (null != poll.left) deque.offer(poll.left);
                if (null != poll.right) deque.offer(poll.right);
            }

        }

        return list;
    }

}
