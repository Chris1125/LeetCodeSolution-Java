package Q1300_1399.Q1365;

import java.util.Arrays;

/**
 * @author Chris
 * @description
 * @since 2020-10-26
 */
public class Solution1 {

    public static void main(String[] args) {
//        int[] input = new int[]{8, 1, 2, 2, 3};
        int[] input = new int[]{0, 0};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(input)));
    }

    /**
     * 计数
     */
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[101];
        for (int num : nums) {
            count[num]++;
        }

        for (int i = 0; i < count.length; i++) {
            if (i == 0) {
                count[0] = 0;
                continue;
            }

            count[i] += count[i - 1];
        }

        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] =  (nums[i] != 0) ? count[nums[i] - 1] : 0;
        }

        return res;
    }

}
