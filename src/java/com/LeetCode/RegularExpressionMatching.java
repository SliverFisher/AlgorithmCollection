package com.LeetCode;

/**
 * https://leetcode.com/problems/regular-expression-matching/
 * Example 1:
 * Input: s = "aa", p = "a"
 * Output: false
 * Explanation: "a" does not match the entire string "aa".
 *
 * Example 2:
 * Input: s = "aa", p = "a*"
 * Output: true
 * Explanation: '*' means zero or more of the preceding element, 'a'. Therefore, by repeating 'a' once, it becomes "aa".
 *
 * Example 3:
 * Input: s = "ab", p = ".*"
 * Output: true
 * Explanation: ".*" means "zero or more (*) of any character (.)".
 *
 * Example 4:
 * Input: s = "aab", p = "c*a*b"
 * Output: true
 * Explanation: c can be repeated 0 times, a can be repeated 1 time. Therefore, it matches "aab".
 *
 * Example 5:
 * Input: s = "mississippi", p = "mis*is*p*."
 * Output: false
 */
public class RegularExpressionMatching {
    public static void main(String[] args) {
        System.out.println(new RegularExpressionMatching().isMatch("mississippi", "mis*is*p*."));
    }

    /**
     * 1.回溯法解决问题,回溯失败，复原回溯前情况
     * 2.设置判断匹配条件，当n=s.length&&x==y时，return true
     * 3.p为主体，去适配s
     */
    public boolean isMatch(String s, String p) {
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charP = s.charAt(i);
            if (check(i, charS, charP)) {

            }
        }
        return true;
    }

    public boolean check(int n, char a, char b) {
        if (a == b)
            return true;
        return false;
    }
}

