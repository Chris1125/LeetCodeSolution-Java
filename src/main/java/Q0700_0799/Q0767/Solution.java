package Q0700_0799.Q0767;

import java.util.PriorityQueue;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/reorganize-string/">重构字符串</a>
 * Difficulty: Medium
 * Status: Solved
 * Daily: 2020-11-30
 * @since 2020-11-30
 */
public class Solution {

    public static void main(String[] args) {
        String s = "aaaaaabbbbbbcccccc";
        System.out.println(reorganizeString(s));
    }

    public static String reorganizeString(String S) {
        char[] charArray = S.toCharArray();
        int[] count = new int[26];

        int length = S.length();
        int maxCount = 0;
        for (char c : charArray) {
            count[c - 'a']++;

            maxCount = Math.max(count[c - 'a'], maxCount);
            if (maxCount > (length + 1) / 2) {
                return "";
            }

        }

        PriorityQueue<Character> queue = new PriorityQueue<>((c1, c2) -> count[c2 - 'a'] - count[c1 - 'a']);

        for (char c = 'a'; c <= 'z'; c++) {
            if (count[c - 'a'] > 0) {
                queue.offer(c);
            }
        }

        StringBuffer sb = new StringBuffer();
        while (queue.size() > 1) {
            Character poll1 = queue.poll();
            Character poll2 = queue.poll();
            sb.append(poll1);
            sb.append(poll2);

            if (--count[poll1 - 'a'] > 0) {
                queue.offer(poll1);
            }

            if (--count[poll2 - 'a'] > 0) {
                queue.offer(poll2);
            }

        }

        if (!queue.isEmpty()) {
            sb.append(queue.poll());
        }

        return sb.toString();
    }

}
