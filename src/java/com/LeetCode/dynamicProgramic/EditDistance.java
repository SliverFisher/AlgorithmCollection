package com.LeetCode.dynamicProgramic;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Author:Wendy
 * @Date:2021/5/25 17:04
 * <p>
 * 0.思考：
 * string A，转化成 String B，两个过程一样
 * <p>
 * 1.确定状态：
 *
 * <p>
 * <p>
 * 2.转移方程：
 */
public class EditDistance {
    public static void main(String[] args) {
        System.out.println(new EditDistance().minDistance("horse", "ros"));
    }

    public int minDistance(String word1, String word2) {
        String from = word1.length() > word2.length() ? word2 : word1;
        String to = word1.length() > word2.length() ? word1 : word2;
        //目的，从小往大转换，则最长不过to.length

        int[] dp = new int[word2.length()];

        return dp[0];
    }

    private String deleteChar(String word1, String word2) {
        char[] chars = word1.toCharArray();
        char[] chars1 = Arrays.copyOf(chars, chars.length - 1);
        char[] chars2 = Arrays.copyOfRange(chars, 1, chars.length);
        if (new String(chars1).contains(word2)) {
            return new String(chars1);
        }
        if (new String(chars2).contains(word2)) {
            return new String(chars2);
        }
        return word2;
    }
}
