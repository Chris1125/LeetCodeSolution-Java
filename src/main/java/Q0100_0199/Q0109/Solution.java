package Q0100_0199.Q0109;

import base.ListNode;
import base.ListNodeUtil;
import base.TreeNode;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/convert-sorted-list-to-binary-search-tree/">有序链表转换二叉搜索树</a>
 * Difficulty: Medium
 * Status: TODO
 * @since 2020-08-18
 */
public class Solution {

    public static void main(String[] args) {
        Integer[] input = {-10, -3, 0, 5, 9};
        ListNode listNode = ListNodeUtil.createListNode(Arrays.stream(input).collect(Collectors.toList()));

        System.out.println(sortedListToBST(listNode));
    }

    public static  TreeNode sortedListToBST(ListNode head) {
        return null;
    }

}
