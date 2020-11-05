package Q0200_0299.Q0206;

import base.ListNode;
import base.ListNodeUtil;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/reverse-linked-list/">反转链表</a>
 * Difficulty: Easy
 * Status: Solved
 * @since 2020-09-08
 */
public class Solution {

    public static void main(String[] args) {
        Integer[] input = {1, 2, 3};
        ListNode listNode = ListNodeUtil.createListNode(Arrays.stream(input).collect(Collectors.toList()));
        listNode = reverseList(listNode);

        System.out.println(listNode);
    }

    public static ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }

        return pre;

    }

}
