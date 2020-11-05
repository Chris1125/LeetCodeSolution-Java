package Q1500_1599.Q1512;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Chris
 * @description
 * @since 2020-11-04
 */
public class Solution1 {

    public static void main(String[] args) {
        int[] input = new int[]{1, 2, 3, 1, 1, 3};

        System.out.println(numIdenticalPairs1(input));
    }

    public static int numIdenticalPairs1(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            Integer count = null == map.get(i) ? 0 : map.get(i);
            count++;
            map.put(i, count);
        }

        int count = 0;
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entries) {
            Integer value = entry.getValue();
            count += value * (value - 1) / 2;
        }

        return count;
    }

}
