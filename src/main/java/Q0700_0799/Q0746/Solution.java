package Q0700_0799.Q0746;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/min-cost-climbing-stairs/">使用最小花费爬楼梯</a>
 * Difficulty: Easy
 * Status: Solved
 * Daily: 2020-12-21
 * @since 2020-12-21
 */
public class Solution {

    public static void main(String[] args) {
        int[] cost = new int[]{10, 15, 20};
        System.out.println(minCostClimbingStairs(cost));
    }

    public static int minCostClimbingStairs(int[] cost) {
        int length = cost.length;
        int[] dp = new int[length + 1];
        dp[0] = 0;
        dp[1] = 0;

        for (int i = 2; i <= length; i++) {
            dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
        }

        return dp[length];
    }

}
