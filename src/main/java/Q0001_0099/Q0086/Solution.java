package Q0001_0099.Q0086;

import base.ListNode;
import base.ListNodeUtil;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/partition-list/solution/fen-ge-lian-biao-by-leetcode-solution-7ade/">分隔链表</a>
 * Difficulty: Medium
 * Status: Solved
 * Daily: 2021-01-03
 * @since 2021-01-03
 */
public class Solution {

    public static void main(String[] args) {
        Integer[] input = {1, 4, 3, 2, 5, 2};
        ListNode listNode = ListNodeUtil.createListNode(Arrays.stream(input).collect(Collectors.toList()));

        System.out.println(partition(listNode, 3));
    }

    public static ListNode partition(ListNode head, int x) {
        ListNode l1 = new ListNode(0);
        ListNode l1Head = l1;
        ListNode l2 = new ListNode(0);
        ListNode l2Head = l2;
        while (head != null) {
            if (head.val < x) {
                l1.next = head;
                l1 = l1.next;
            } else {
                l2.next = head;
                l2 = l2.next;
            }

            head = head.next;
        }

        l2.next = null;
        l1.next = l2Head.next;

        return l1Head.next;
    }

}
