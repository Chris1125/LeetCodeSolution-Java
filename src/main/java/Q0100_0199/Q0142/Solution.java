package Q0100_0199.Q0142;

import base.ListNode;
import base.ListNodeUtil;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/linked-list-cycle-ii/">环形链表 II</a>
 * Difficulty: Medium
 * Status: Solved
 * Daily: 2020-10-10
 * @since 2020-10-10
 */
public class Solution {

    public static void main(String[] args) {
        Integer[] input = {3, 2, 0, -4};
        ListNode listNode = ListNodeUtil.createListNode(Arrays.stream(input).collect(Collectors.toList()));
        listNode.next.next.next.next = listNode.next;
        ListNode detectCycle = detectCycle(listNode);

        System.out.println(detectCycle);
    }

    public static ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != slow) {
            if (fast == null || fast.next == null) {
                return null;
            }

            fast = fast.next.next;
            slow = slow.next;
        }

        fast = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return fast;
    }

}
