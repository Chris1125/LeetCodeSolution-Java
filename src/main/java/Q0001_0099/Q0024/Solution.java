package Q0001_0099.Q0024;

import base.ListNode;
import base.ListNodeUtil;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/swap-nodes-in-pairs/">两两交换链表中的节点</a>
 * Difficult: Medium
 * Status: Solved
 * Daily: 2020-10-13
 * @since 2020-09-09
 */
public class Solution {

    public static void main(String[] args) {
        Integer[] input = {1, 2, 3, 4};
        ListNode listNode = ListNodeUtil.createListNode(Arrays.stream(input).collect(Collectors.toList()));

        ListNode listNode1 = swapPairs(listNode);
    }

    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode temp = head.next;
        head.next = swapPairs(temp.next);
        temp.next = head;

        return temp;
    }

}
