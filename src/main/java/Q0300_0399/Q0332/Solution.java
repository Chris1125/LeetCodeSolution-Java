package Q0300_0399.Q0332;

import java.util.*;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/reconstruct-itinerary/">重新安排行程</a>
 * Difficulty: Medium
 * Status: TODO
 * Daily: 2020-08-27
 * @since 2020-08-27
 */
public class Solution {

    public static void main(String[] args) {
        // [["JFK","SFO"],["JFK","ATL"],["SFO","ATL"],["ATL","JFK"],["ATL","SFO"]]
        // [["MUC","LHR"],["JFK","MUC"],["SFO","SJC"],["LHR","SFO"]]
        // [["JFK","KUL"],["JFK","NRT"],["NRT","JFK"]]
        String input = "[[\"JFK\",\"KUL\"],[\"JFK\",\"NRT\"],[\"NRT\",\"JFK\"]]";
        String[] split = input.split("],\\[");

        List<List<String>> listList = new ArrayList<>();
        for (String s : split) {
            s = s.replaceAll("\\[", "");
            s = s.replaceAll("]", "");
            s = s.replaceAll("\"", "");
            String[] split1 = s.split(",");
            List<String> strings = Arrays.asList(split1);
            listList.add(strings);
        }

        System.out.println(findItinerary(listList));
    }

    public static List<String> findItinerary(List<List<String>> tickets) {
        return null;
    }

}
