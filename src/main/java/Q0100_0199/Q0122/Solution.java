package Q0100_0199.Q0122;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/">买卖股票的最佳时机 II</a>
 * Difficulty: Easy
 * Status: Solved
 * Daily: 2020-11-08
 * @since 2020-11-08
 */
public class Solution {

    public static void main(String[] args) {
//        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
//        int[] prices = new int[]{1, 2, 3, 4, 5};
        int[] prices = new int[]{7, 6, 4, 3, 1};

        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int sum = 0;
        for (int i = 1; i < prices.length; i++) {
            if ((prices[i] - prices[i - 1]) > 0) {
                sum = sum + (prices[i] - prices[i - 1]);
            }

        }

        return sum;
    }

}
