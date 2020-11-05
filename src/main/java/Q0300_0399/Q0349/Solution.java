package Q0300_0399.Q0349;

import java.util.Arrays;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/intersection-of-two-arrays/">两个数组的交集</a>
 * Difficulty: Easy
 * Status: Solved
 * Daily: 2020-11-02
 * @since 2020-11-02
 */
public class Solution {

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 2, 1};
        int[] nums2 = new int[]{2, 2};

        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int length1 = nums1.length;
        int i = 0;
        int length2 = nums2.length;
        int j = 0;

        int[] res = new int[Math.max(length1, length2)];
        int index = 0;
        while (i < length1 && j < length2) {
            int num1 = nums1[i];
            int num2 = nums2[j];
            if (num1 == num2) {
                if (index == 0 || res[index - 1] != num1) {
                    res[index++] = num1;
                }

                i++;
                j++;
            } else if (num1 < num2) {
                i++;
            } else {
                j++;
            }

        }

        return Arrays.copyOfRange(res, 0, index);
    }

}
