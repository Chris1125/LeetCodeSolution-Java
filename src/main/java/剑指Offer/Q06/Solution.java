package 剑指Offer.Q06;

import base.ListNode;
import base.ListNodeUtil;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.Collectors;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/">从尾到头打印链表</a>
 * Difficulty: Easy
 * Status: Solved
 * @since 2020-10-15
 */
public class Solution {

    public static void main(String[] args) {
        Integer[] input = {1, 3, 2};
        ListNode listNode = ListNodeUtil.createListNode(Arrays.stream(input).collect(Collectors.toList()));

        System.out.println(Arrays.toString(reversePrint(listNode)));
    }

    public static int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while (null != head) {
            stack.push(head.val);
            head = head.next;
        }

        int[] res = new int[stack.size()];
        int index = 0;
        while (!stack.isEmpty()) {
            res[index++] = stack.pop();
        }

        return res;
    }

}
