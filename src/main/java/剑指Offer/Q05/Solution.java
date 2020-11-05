package 剑指Offer.Q05;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/">替换空格</a>
 * Difficulty: Easy
 * Status: Solved
 * @since 2020-10-15
 */
public class Solution {

    public String replaceSpace(String s) {
        StringBuilder sb = new StringBuilder();
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);

            if (c == ' ') {
                sb.append("%20");
            } else {
                sb.append(c);
            }

        }

        return sb.toString();
    }

}
