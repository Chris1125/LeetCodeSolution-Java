package base;

import java.util.List;

/**
 * @author Chris
 * @description
 * @since 2020-08-18
 */
public class ListNodeUtil {

    public static ListNode createListNode(List<Integer> input) {
        if (null == input || input.size() == 0) return null;

        ListNode root = new ListNode();
        root.val = input.get(0);
        for (int i = 1; i < input.size(); i++) {
            add(root, input.get(i));
        }

        return root;
    }

    private static void add(ListNode root, int i) {
        if (root == null) {
            root = new ListNode();
            root.val = i;
        }

        ListNode next = new ListNode();
        if (root.next == null) {
            next.val = i;
            root.next = next;
        } else {
            add(root.next, i);
        }

    }

}
