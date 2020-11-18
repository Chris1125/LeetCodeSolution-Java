package Q0100_0199.Q0134;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/gas-station/">加油站</a>
 * Difficulty: Medium
 * Status: Solved
 * Daily: 2020-11-18
 * @since 2020-11-18
 */
public class Solution {

    public static void main(String[] args) {
        int[] gas = new int[]{1, 2, 3, 4, 5};
        int[] cost = new int[]{3, 4, 5, 1, 2};

        System.out.println(canCompleteCircuit(gas, cost));
    }

    /**
     * 暴力解法
     */
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        for (int i = 0; i < n; i++) {
            int j = i;
            int cur = gas[i];
            while (cur - cost[j] >= 0) {
                cur = cur - cost[j] + gas[(j + 1) % n];
                j = (j + 1) % n;
                if (j == i) {
                    return i;
                }

            }

        }

        return -1;
    }

}
