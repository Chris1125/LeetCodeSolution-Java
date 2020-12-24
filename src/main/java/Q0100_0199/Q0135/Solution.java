package Q0100_0199.Q0135;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/candy/">分发糖果</a>
 * Difficulty: Hard
 * Status: Solved
 * Daily: 2020-12-24
 * @since 2020-12-24
 */
public class Solution {

    public static void main(String[] args) {
//        int[] ratings = new int[]{1, 0, 2};
//        int[] ratings = new int[]{1, 2, 2};
        int[] ratings = new int[]{1, 3, 2, 2, 1};

        System.out.println(candy(ratings));
    }

    public static int candy(int[] ratings) {
        int length = ratings.length;
        int[] candys = new int[length];

        for (int i = 0; i < length; i++) {
            if (i > 0 && ratings[i] > ratings[i - 1]) {
                candys[i] = candys[i - 1] + 1;
            } else {
                candys[i] = 1;
            }

        }

        int sum = 0;
        int temp = 0;
        for (int i = length - 1; i >= 0; i--) {
            if (i < length - 1 && ratings[i] > ratings[i + 1]) {
                temp++;
            } else {
                temp = 1;
            }

            sum += Math.max(candys[i], temp);
        }

        return sum;
    }

}
