package Q0300_0399.Q0328;

import base.ListNode;
import base.ListNodeUtil;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/odd-even-linked-list/">奇偶链表</a>
 * Difficulty: Medium
 * Status: Solved
 * Daily: 2020-11-13
 * @since 2020-11-13
 */
public class Solution {

    public static void main(String[] args) {
        Integer[] input = {1, 2, 3, 4, 5, 6, 7, 8};
        ListNode listNode = ListNodeUtil.createListNode(Arrays.stream(input).collect(Collectors.toList()));
        oddEvenList(listNode);

    }

    public static ListNode oddEvenList(ListNode head) {
        if (null == head || null == head.next) {
            return head;
        }

        ListNode evenHead = head.next;
        ListNode even = evenHead;
        ListNode odd = head;
        while (null != even && null != even.next) {
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;

        return head;
    }

}
