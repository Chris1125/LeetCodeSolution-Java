package Q0001_0099.Q0019;

import base.ListNode;
import base.ListNodeUtil;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/">删除链表的倒数第N个节点</a>
 * Difficulty: Medium
 * Status: Solved
 * Daily: 2020-10-18
 * @since 2020-10-18
 */
public class Solution {

    public static void main(String[] args) {
        Integer[] input = {1, 2, 3, 4, 5};
        ListNode listNode = ListNodeUtil.createListNode(Arrays.stream(input).collect(Collectors.toList()));

        ListNode listNode1 = removeNthFromEnd(listNode, 2);
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int length = getLength(head);
        ListNode temp = head;
        for (int i = 0; i < length - n; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;

        return head;
    }

    public static int getLength(ListNode listNode) {
        int length = 0;

        while (null != listNode) {
            length++;
            listNode = listNode.next;
        }

        return length;
    }

}
