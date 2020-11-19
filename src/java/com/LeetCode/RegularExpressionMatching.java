package com.LeetCode;

/**
 * https://leetcode.com/problems/regular-expression-matching/
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

