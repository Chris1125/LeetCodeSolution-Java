package Q1000_1099.Q1046;

import java.util.PriorityQueue;

/**
 * @author Chris
 * @description
 * @since 2020-12-30
 */
public class Solution1 {

    public static int lastStoneWeight1(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int stone : stones) {
            pq.offer(stone);
        }

        while (pq.size() > 1) {
            int a = pq.poll();
            int b = pq.poll();
            if (a > b) {
                pq.offer(a - b);
            }
        }

        return pq.isEmpty() ? 0 : pq.poll();
    }

}
