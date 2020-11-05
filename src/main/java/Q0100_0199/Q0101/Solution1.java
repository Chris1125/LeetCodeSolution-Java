package Q0100_0199.Q0101;

import base.Node;

/**
 * @author Chris
 * @description
 * @since 2020-10-15
 */
public class Solution1 {

    /**
     * 递归解法
     */
    public Node connect(Node root) {
        recursion(root);

        return root;
    }

    public void recursion(Node root) {
        if (null == root) {
            return;
        }

        if (null != root.left) {
            root.left.next = root.right;
        }

        if (null != root.right && null != root.next) {
            root.right.next = root.next.left;
        }

        recursion(root.left);
        recursion(root.right);
    }

}
