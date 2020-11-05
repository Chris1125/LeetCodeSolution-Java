package Q0600_0699.Q0657;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/robot-return-to-origin/">机器人能否返回原点</a>
 * Difficulty: Easy
 * Status: Solved
 * Daily: 2020-08-28
 * @since 2020-08-28
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(judgeCircle1("LRUUU"));
    }

    public static boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < moves.length(); i++) {
            String str = moves.substring(i, i + 1);
            switch (str) {
                case "L":
                    x -= 1;
                    break;

                case "R":
                    x += 1;
                    break;

                case "U":
                    y += 1;
                    break;

                case "D":
                    y -= 1;
                    break;

                default:
                    break;
            }

        }

        return x == 0 && y == 0;
    }

    public static boolean judgeCircle1(String moves) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : moves.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        return map.getOrDefault('L', 0).equals(map.getOrDefault('R', 0)) &&
                map.getOrDefault('U', 0).equals(map.getOrDefault('D', 0));
    }
}
