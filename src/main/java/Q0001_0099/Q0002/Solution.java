package Q0001_0099.Q0002;

import base.ListNode;
import base.ListNodeUtil;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/add-two-numbers/">两数相加</a>
 * Difficulty: Medium
 * Status: Solved
 * Daily: 2020-10-04
 * @since 2020-08-24
 */
public class Solution {

    public static void main(String[] args) {
        Integer[] input1 = {2, 4, 3};
        Integer[] input2 = {5, 6, 4};
        ListNode l1 = ListNodeUtil.createListNode(Arrays.stream(input1).collect(Collectors.toList()));
        ListNode l2 = ListNodeUtil.createListNode(Arrays.stream(input2).collect(Collectors.toList()));

        ListNode listNode = addTwoNumbers(l1, l2);
        System.out.println(listNode);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        result.val = 0;
        ListNode temp = result;
        int sum = 0;
        ListNode a = l1;
        ListNode b = l2;
        while (null != a || null != b) {
            sum = sum + (null == a ? 0 : a.val) + (null == b ? 0 : b.val);
            int i = sum % 10;
            sum = sum / 10;
            temp.next = new ListNode();
            temp.next.val = i;
            temp = temp.next;

            if (null != a) {
                a = a.next;
            }

            if (null != b) {
                b = b.next;
            }

        }

        if (sum > 0) {
            temp = new ListNode();
            temp.val = sum;
        }

        return result.next;
    }

}
