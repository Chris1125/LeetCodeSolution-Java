package Q0100_0199.Q0141;

import base.ListNode;
import base.ListNodeUtil;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/linked-list-cycle/">环形链表</a>
 * Difficulty: Easy
 * Status: Solved
 * Daily: 2020-10-09
 * @since 2020-10-09
 */
public class Solution {
    public static void main(String[] args) {
        Integer[] input = {3, 2, 0, -4};
        ListNode listNode = ListNodeUtil.createListNode(Arrays.stream(input).collect(Collectors.toList()));
        listNode.next.next.next.next = listNode.next;

        System.out.println(hasCycle(listNode));
    }

    public static boolean hasCycle(ListNode head) {
        if (null == head || null == head.next) {
            return false;
        }

        ListNode fast = head.next;
        ListNode slow = head;
        while (fast != slow) {
            if (null == fast || null == fast.next){
                return false;
            }

            fast = fast.next.next;
            slow = slow.next;
        }

        return true;
    }

}
