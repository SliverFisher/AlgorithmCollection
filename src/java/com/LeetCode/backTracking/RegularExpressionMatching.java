package com.LeetCode.backTracking;

/**
 * https://leetcode.com/problems/regular-expression-matching/
 * Example 1:
 * Input: s = "aa", p = "a"
 * Output: false
 * Explanation: "a" does not match the entire string "aa".
 * <p>
 * Example 2:
 * Input: s = "aa", p = "a*"
 * Output: true
 * Explanation: '*' means zero or more of the preceding element, 'a'. Therefore, by repeating 'a' once, it becomes "aa".
 * <p>
 * Example 3:
 * Input: s = "ab", p = ".*"
 * Output: true
 * Explanation: ".*" means "zero or more (*) of any character (.)".
 * <p>
 * Example 4:
 * Input: s = "aab", p = "c*a*b"
 * Output: true
 * Explanation: c can be repeated 0 times, a can be repeated 1 time. Therefore, it matches "aab".
 * <p>
 * Example 5:
 * Input: s = "mississippi", p = "mis*is*p*."
 * Output: false
 */
public class RegularExpressionMatching {
    /**
     * 1.回溯法解决问题,回溯失败，复原回溯前情况
     * 2.设置判断匹配条件，当n=s.length&&x==y时，return true
     * 3.p为主体，去适配s
     */

    public static void main(String[] args) {
        System.out.println(new RegularExpressionMatching().isMatch2("mississippi", "mis*is*p*."));
    }

    public boolean isMatch2(String s, String p) {
        if (s == null || p == null) return false;
        return isMatch2(s.toCharArray(), 0, p.toCharArray(), 0);
    }

    private boolean isMatch2(char[] s, int indexOfS, char[] p, int indexOfP) {
        if (indexOfP == p.length) return indexOfS == s.length;
        if (indexOfP == p.length - 1 || p[indexOfP + 1] != '*') {
            if (indexOfS < s.length && (p[indexOfP] == '.' || s[indexOfS] == p[indexOfP])) {
                return isMatch2(s, indexOfS + 1, p, indexOfP + 1);
            } else {
                return false;
            }
        }
        while (indexOfS < s.length && (p[indexOfP] == '.' || s[indexOfS] == p[indexOfP])) {
            if (isMatch2(s, indexOfS, p, indexOfP + 2)) return true;
            indexOfS++;
        }
        return isMatch2(s, indexOfS, p, indexOfP + 2);
    }
}

