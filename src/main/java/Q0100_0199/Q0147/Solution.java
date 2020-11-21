package Q0100_0199.Q0147;

import base.ListNode;
import base.ListNodeUtil;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/insertion-sort-list/">对链表进行插入排序</a>
 * Difficulty: Medium
 * Status: Solved
 * Daily: 2020-11-20
 * @since 2020-11-20
 */
public class Solution {

    public static void main(String[] args) {
        Integer[] input = {4, 2, 1, 3};
        ListNode listNode = ListNodeUtil.createListNode(Arrays.stream(input).collect(Collectors.toList()));

        listNode = insertionSortList(listNode);

        System.out.println(listNode);
    }

    public static ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode pre = head, cur = head.next;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        while (cur != null) {
            if (pre.val < cur.val) {
                pre = cur;
                cur = cur.next;
            } else {
                ListNode p = dummy;
                while (p.next.val < cur.val) {
                    p = p.next;
                }

                pre.next = cur.next;
                cur.next = p.next;
                p.next = cur;
                cur = pre.next;
            }

        }

        return dummy.next;
    }

}
