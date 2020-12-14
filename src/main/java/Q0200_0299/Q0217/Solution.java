package Q0200_0299.Q0217;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/contains-duplicate/">存在重复元素</a>
 * Difficulty: Easy
 * Status: Solved
 * Daily: 2020-12-13
 * @since 2020-12-13
 */
public class Solution {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            Integer put = map.put(num, num);
            if (null != put) {
                return true;
            }

            map.put(num, 1);
        }

        return false;
    }
}
