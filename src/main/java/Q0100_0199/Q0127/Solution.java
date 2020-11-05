package Q0100_0199.Q0127;

import java.util.*;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/word-ladder/">单词接龙</a>
 * Difficulty: Medium
 * Status: TODO
 * Daily: 2020-11-05
 * @since 2020-11-05
 */
public class Solution {

    public static void main(String[] args) {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = new ArrayList<>();
        wordList.add("hot");
        wordList.add("dot");
        wordList.add("dog");
        wordList.add("lot");
        wordList.add("log");
        wordList.add("cog");

        System.out.println(ladderLength(beginWord, endWord, wordList));
    }

    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        return 0;
    }

}
