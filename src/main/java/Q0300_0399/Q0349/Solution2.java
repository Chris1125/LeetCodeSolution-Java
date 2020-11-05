package Q0300_0399.Q0349;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Chris
 * @description
 * @since 2020-11-02
 */
public class Solution2 {

    public static void main(String[] args) {
        int[] nums1 = new int[]{1};
        int[] nums2 = new int[]{1};

        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Boolean> map = new HashMap<>();
        for (int i : nums1) {
            map.put(i, true);
        }

        int[] res = new int[Math.min(nums1.length, nums2.length)];
        int index = 0;
        for (int i : nums2) {
            if (map.containsKey(i)) {
                res[index++] = i;
                map.remove(i);
            }

        }

        return Arrays.copyOfRange(res, 0, index);
    }
}
