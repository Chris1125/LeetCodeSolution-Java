package Q0001_0099.Q0011;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/container-with-most-water/">盛水最多的容器</a>
 * Difficulty: Medium
 * Status: Solved
 * @since 2020-08-27
 */
public class Solution {

    public static void main(String[] args) {
        int[] input = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};

        System.out.println(maxArea(input));
    }

    public static int maxArea(int[] height) {
        int i = height.length;
        int header = 0;
        int tail = i - 1;

        int max = 0;
        while (header < tail) {
            max = Math.max(max, Math.min(height[header], height[tail]) * (tail - header));
            if (height[header] > height[tail]) {
                tail--;
            } else {
                header++;
            }

        }

        return max;
    }

}
