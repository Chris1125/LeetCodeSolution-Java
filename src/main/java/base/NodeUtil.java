package base;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Chris
 * @description
 * @since 2020-08-18
 */
public class NodeUtil {

    public static Node createTreeByLevelOrder(List<Integer> input) {
        if (input.size() == 0) return null;
        Node root = new Node();
        root.val = input.remove(0);
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (input.size() > 0) {
            Node current = queue.poll();

            if (input.size() > 0) {
                Integer remove = input.remove(0);
                if (null != remove) {
                    current.left = new Node();
                    current.left.val = remove;
                    queue.offer(current.left);
                }
            }

            if (input.size() > 0) {
                Integer remove = input.remove(0);
                if (null != remove) {
                    current.right = new Node();
                    current.right.val = remove;
                    queue.offer(current.right);
                }

            }

        }

        return root;
    }
}
