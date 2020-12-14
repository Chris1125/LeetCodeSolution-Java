package Q0600_0699.Q0649;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/dota2-senate/">Dota2 参议院</a>
 * Difficulty: Medium
 * Status: Solved
 * Daily: 2020-12-11
 * @since 2020-12-11
 */
public class Solution {

    public static void main(String[] args) {
        String senate = "RDD";
        System.out.println(predictPartyVictory(senate));
    }

    public static String predictPartyVictory(String senate) {
        Deque<Integer> radiantQueue = new LinkedList<>();
        Deque<Integer> direQueue = new LinkedList<>();

        int length = senate.length();
        for (int i = 0; i < length; i++) {
            char c = senate.charAt(i);
            if (c == 'R') {
                radiantQueue.offer(i);
            }

            if (c == 'D') {
                direQueue.offer(i);
            }

        }

        while (!radiantQueue.isEmpty() && !direQueue.isEmpty()) {
            Integer radiant = radiantQueue.poll();
            Integer dire = direQueue.poll();
            if (radiant < dire) {
                radiantQueue.offer(radiant + length);
            } else {
                direQueue.offer(dire + length);
            }

        }

        return !radiantQueue.isEmpty() ? "Radiant" : "Dire";
    }

}
