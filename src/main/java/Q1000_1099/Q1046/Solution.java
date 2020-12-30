package Q1000_1099.Q1046;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/last-stone-weight/">最后一块石头的重量</a>
 * Difficulty: Easy
 * Status: Solved
 * Daily: 2020-12-30
 * @since 2020-12-30
 */
public class Solution {

    public static void main(String[] args) {
        int size = 30;
        int[] stones = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            stones[i] = random.nextInt(size);
        }

        System.out.println(lastStoneWeight(stones));
    }

    public static int lastStoneWeight(int[] stones) {
        if (null == stones || stones.length == 0) {
            return 0;
        }

        if (stones.length == 1) {
            return stones[0];
        }

        Arrays.sort(stones);
        while (stones[stones.length - 2] != 0) {
            stones[stones.length - 1] = stones[stones.length - 1] - stones[stones.length - 2];
            stones[stones.length - 2] = 0;
            Arrays.sort(stones);
        }

        return stones[stones.length - 1];
    }

}
