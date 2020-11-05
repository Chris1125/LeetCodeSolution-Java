package Q0001_0099.Q0021;

import base.ListNode;
import base.ListNodeUtil;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/merge-two-sorted-lists/">合并两个有序链表</a>
 * Difficulty: Easy
 * Status: Solved
 * @since 2020-09-14
 */
public class Solution {

    public static void main(String[] args) {
        Integer[] input1 = {1, 2, 4};
        Integer[] input2 = {1, 3, 4};
        ListNode l1 = ListNodeUtil.createListNode(Arrays.stream(input1).collect(Collectors.toList()));
        ListNode l2 = ListNodeUtil.createListNode(Arrays.stream(input2).collect(Collectors.toList()));

        ListNode listNode = mergeTwoLists(l1, l2);
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (null == l1) {
            return l2;
        } else if (null == l2) {
            return l1;
        } else {
            if (l1.val < l2.val) {
                l1.next = mergeTwoLists(l1.next, l2);
                return l1;
            } else {
                l2.next = mergeTwoLists(l1, l2.next);
                return l2;
            }

        }

    }

}
