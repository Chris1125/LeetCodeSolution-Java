package Q0800_0899.Q0841;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/keys-and-rooms/">钥匙和房间</a>
 * Difficulty: Medium
 * Status: Solved
 * Daily: 2020-08-31
 * @since 2020-08-31
 */
public class Solution {
    static boolean[] visit;

    static int totalRooms = 0;

    public static void main(String[] args) {
        String input = "[[1],[2],[3],[]]";
        String[] split = input.split("],\\[");

        List<List<Integer>> listList = new ArrayList<>();
        for (String s : split) {
            s = s.replaceAll("\\[", "");
            s = s.replaceAll("]", "");
            s = s.replaceAll("\"", "");
            String[] split1 = s.split(",");
            List<Integer> list = new ArrayList<>();
            for (String s1 : split1) {
                if (null != s1 && s1.length() != 0 && !s1.contains(" ")) {
                    list.add(Integer.parseInt(s1));
                }

            }

            listList.add(list);
        }

        System.out.println(canVisitAllRooms(listList));
    }

    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int size = rooms.size();
        visit = new boolean[size];
        dfs(rooms, 0);

        return size == totalRooms;
    }

    public static void dfs(List<List<Integer>> rooms, int key) {
        totalRooms++;
        visit[key] = true;
        for (int i : rooms.get(key)) {
            if (!visit[i]) {
                dfs(rooms, i);
            }

        }

    }

}
