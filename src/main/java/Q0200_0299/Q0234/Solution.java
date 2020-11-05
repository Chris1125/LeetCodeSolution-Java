package Q0200_0299.Q0234;

import base.ListNode;
import base.ListNodeUtil;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/palindrome-linked-list/">回文链表</a>
 * Difficulty: Easy
 * Status: TODO
 * Daily: 2020-10-23
 * @since 2020-10-23
 */
public class Solution {

    public static void main(String[] args) {
        Integer[] input = {1, 2};
        ListNode listNode = ListNodeUtil.createListNode(Arrays.stream(input).collect(Collectors.toList()));

        System.out.println(isPalindrome(listNode));
    }

    public static boolean isPalindrome(ListNode head) {
        return false;
    }

}
