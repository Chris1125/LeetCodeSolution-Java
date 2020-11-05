package Q0001_0099.Q0001;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/two-sum/">两数之和</a>
 * Difficulty: Easy
 * Status: Solved
 * Daily: 2020-10-03
 * @since 2020-10-03
 */
public class Solution {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.put(target - i, i);
        }

        for (int i : nums) {
            if (map.containsKey(i)) {
                res[0] = map.get(i);
                res[1] = i;
                return res;
            }

        }

        return res;
    }

}
