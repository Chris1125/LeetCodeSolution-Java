package Q0800_0899.Q0844;

/**
 * @author Chris
 * @description <a href="https://leetcode-cn.com/problems/x-of-a-kind-in-a-deck-of-cards/">卡牌分组</a>
 * Difficulty: Easy
 *
 * @since 2020-10-19
 */
public class Solution1 {

    public static void main(String[] args) {
        String S = "ab##";
        String T = "a#c#";

        System.out.println(backspaceCompare(S, T));
    }

    public static boolean backspaceCompare(String S, String T) {
        int i = S.length() - 1;
        int j = T.length() - 1;
        while (i >= 0 || j >= 0) {
            int skip1 = 0;
            while (i >= 0) {
                if (S.charAt(i) == '#') {
                    i--;
                    skip1++;
                } else {
                    if (skip1 > 0) {
                        i--;
                        skip1--;
                    } else {
                        break;
                    }

                }

            }

            int skip2 = 0;
            while (j >= 0) {
                if (T.charAt(j) =='#') {
                    j--;
                    skip2++;
                } else {
                    if (skip2 > 0) {
                        j--;
                        skip2--;
                    } else {
                        break;
                    }

                }

            }

            if (i >= 0 && j >= 0) {
                char c1 = S.charAt(i);
                char c2 = T.charAt(j);

                if (c1 != c2) {
                    return false;
                }

            } else {
                if (i >= 0 || j >= 0) {
                    return false;
                }

            }

            i--;
            j--;
        }

        return true;
    }

}
