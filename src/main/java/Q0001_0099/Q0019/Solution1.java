package Q0001_0099.Q0019;

import base.ListNode;
import base.ListNodeUtil;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author Chris
 * @description
 * @since 2020-10-18
 */
public class Solution1 {

    public static void main(String[] args) {
        Integer[] input = {1, 2};
        ListNode listNode = ListNodeUtil.createListNode(Arrays.stream(input).collect(Collectors.toList()));

        ListNode listNode1 = removeNthFromEnd(listNode, 2);
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        while (null != fast) {
            fast = fast.next;
            slow = slow.next;
            n--;
        }

        slow.next = slow.next.next;

        return head;
    }

}

