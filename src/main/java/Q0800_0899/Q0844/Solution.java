package Q0800_0899.Q0844;

import java.util.Stack;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/backspace-string-compare/">比较含退格的字符串</a>
 * Difficulty: Easy
 * Status: Solved
 * Daily: 2020-10-19
 * @since 2020-10-19
 */
public class Solution {

    public static void main(String[] args) {
        String S = "ab#c";
        String T = "###";

        System.out.println(backspaceCompare(S, T));
    }

    public static boolean backspaceCompare(String S, String T) {
        int i = 0;
        int j = 0;
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        while (i < S.length() || j < T.length()) {
            if (i < S.length()) {
                if (S.charAt(i) != '#') {
                    stack1.push(S.charAt(i));
                } else {
                    if (!stack1.isEmpty()) {
                        stack1.pop();
                    }

                }

                i++;
            }

            if (j < T.length()) {
                if (T.charAt(j) != '#') {
                    stack2.push(T.charAt(j));
                } else {
                    if (!stack2.isEmpty()) {
                        stack2.pop();
                    }

                }

                j++;
            }

        }

        return stack1.equals(stack2);
    }

}
