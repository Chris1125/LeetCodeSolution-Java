package Q0800_0899.Q0860;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/lemonade-change/">柠檬水找零</a>
 * Difficulty: Easy
 * Status: Solved
 * Daily: 2020-12-10
 * @since 2020-12-10
 */
public class Solution {

    public static void main(String[] args) {
        int[] bills = new int[]{5, 5, 5, 10, 20};
        System.out.println(lemonadeChange(bills));
    }

    public static boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;

        for (int bill : bills) {
            if (bill == 5) {
                five++;
            } else if (bill == 10) {
                if (five == 0) {
                    return false;
                }

                five--;
                ten++;
            } else if (bill == 20) {
                if (five > 0 && ten > 0) {
                    five--;
                    ten--;
                } else if (five > 3) {
                    five -= 3;
                } else {
                    return false;
                }

            }

        }

        return true;
    }
}
