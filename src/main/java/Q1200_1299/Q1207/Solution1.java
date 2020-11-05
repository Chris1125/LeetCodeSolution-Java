package Q1200_1299.Q1207;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Chris
 * @description
 * @since 2020-10-28
 */
public class Solution1 {

    public static void main(String[] args) {
        int[] input = new int[]{1, 2, 2, 1, 1, 3};
//        int[] input = new int[]{1, 2, 2, 1};
//        int[] input = new int[]{-1000, 1000};
//        int[] input = new int[]{};

        System.out.println(uniqueOccurrences(input));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        Set<Integer> set = new HashSet<>();
        Arrays.sort(arr);
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                if (!set.add(count)) {
                    return false;
                }

                count = 1;
            }

        }

        return set.add(count);
    }

}
