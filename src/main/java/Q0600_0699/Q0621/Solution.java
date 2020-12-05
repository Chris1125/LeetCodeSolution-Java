package Q0600_0699.Q0621;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/task-scheduler/">任务调度器</a>
 * Difficulty: Medium
 * Status: Solved
 * Daily: 2020-12-05
 * @since 2020-12-05
 */
public class Solution {

    public static void main(String[] args) {
//        char[] tasks = new char[]{'A', 'A', 'A', 'B', 'B', 'B'};
//        int n = 2;
        char[] tasks = new char[]{'A','A','A','A','A','A','B','C','D','E','F','G'};
        int n = 2;
        System.out.println(leastInterval(tasks, n));
    }

    public  static int leastInterval(char[] tasks, int n) {
        int[] count = new int[26];
        int maxCount = 0;
        for (char task : tasks) {
            count[task - 'A']++;

            maxCount = Math.max(maxCount, count[task - 'A']);
        }

        int res = 0;
        for (int i : count) {
            if (i == maxCount) {
                res++;
            }

        }

        res += (maxCount - 1) * (n + 1);

        return Math.max(res, tasks.length);
    }


}
