package Q0001_0099.Q0020;

import java.util.*;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/valid-parentheses/">有效的括号</a>
 * Difficulty: Easy
 * Status: Solved
 * @since 2020-09-09
 */
public class Solution {

    public static void main(String[] args) {
        String s = "([}}])";

        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        if (s.length() % 2 == 1) {
            return false;
        }

        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.toCharArray().length; i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                if (stack.isEmpty() || stack.peek() != map.get(c)) {
                    return false;
                }

                if (map.get(c).equals(stack.peek())) {
                    stack.pop();
                }

            } else {
                stack.push(c);
            }

        }

        return stack.size() == 0;
    }

}
