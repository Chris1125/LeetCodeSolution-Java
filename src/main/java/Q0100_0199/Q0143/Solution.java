package Q0100_0199.Q0143;

import base.ListNode;
import base.ListNodeUtil;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/reorder-list/">重排链表</a>
 * Difficulty: Medium
 * Status: Solved
 * Daily: 2020-10-20
 * @since 2020-10-20
 */
public class Solution {

    public static void main(String[] args) {
        Integer[] input = {1, 2, 3, 4, 5};
        ListNode listNode = ListNodeUtil.createListNode(Arrays.stream(input).collect(Collectors.toList()));
        reorderList(listNode);

        System.out.println(listNode);
    }

    public static void reorderList(ListNode head) {
        if (null == head) {
            return;
        }

        // 找到中间节点
        ListNode fast = head;
        ListNode slow = head;

        while (null != fast.next && null != fast.next.next) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode mid = slow;

        // 翻转链表后半段
        ListNode pre = null;
        ListNode cur = mid;
        while (null != cur.next) {
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }

        ListNode head2 = cur;

        while (null != head && null != head2) {
            ListNode next = head.next;
            ListNode next1 = head2.next;

            head.next = head2;
            head = next;
            head2.next = head;
            head2 = next1;
        }

    }

}
