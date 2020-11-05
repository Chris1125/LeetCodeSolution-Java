package 剑指Offer.Q06;

import base.ListNode;
import base.ListNodeUtil;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author Chris
 * @description
 * @since 2020-10-15
 */
public class Solution1 {

    public static void main(String[] args) {
        Integer[] input = {1, 3, 2};
        ListNode listNode = ListNodeUtil.createListNode(Arrays.stream(input).collect(Collectors.toList()));

        System.out.println(Arrays.toString(reversePrint(listNode)));
    }

    public static int[] reversePrint(ListNode head) {
        int size = 0;
        ListNode temp = head;
        while (null != temp) {
            size++;
            temp = temp.next;
        }

        temp = head;

        int[] res = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            res[i] = temp.val;
            temp = temp.next;
        }

        return res;
    }

}
