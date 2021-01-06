package Q0800_0899.Q0830;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/positions-of-large-groups/">较大分组的位置</a>
 * Difficulty: Easy
 * Status: Solved
 * Daily: 2021-01-05
 * @since 2021-01-05
 */
public class Solution {

    public static void main(String[] args) {
//        String s = "abbxxxxzzy";
//        String s = "aaa";
        String s = "abcdddeeeeaabbbcd";

        System.out.println(largeGroupPositions(s));
    }

    public static List<List<Integer>> largeGroupPositions(String s) {
        int start = 0;
        List<List<Integer>> resList = new ArrayList<>();
        for (int end = 1; end < s.length(); end++) {
            if (s.charAt(end) != s.charAt(start)) {
                if (end - start >= 3) {
                    List<Integer> list = new ArrayList<>();
                    list.add(start);
                    list.add(end - 1);

                    resList.add(list);
                }

                start = end;
            }
        }

        if (s.length() - start >= 3) {
            List<Integer> list = new ArrayList<>();
            list.add(start);
            list.add(s.length() - 1);
            resList.add(list);
        }

        return resList;
    }

}
