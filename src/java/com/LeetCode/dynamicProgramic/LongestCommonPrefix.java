package com.LeetCode.dynamicProgramic;

import java.math.BigDecimal;

public class LongestCommonPrefix {
    public static void main(String[] args) throws Exception {
        System.out.println(new LongestCommonPrefix().longestCommonPrefix(new String[]{"sss", "s222", "s"}));
        System.out.println(new BigDecimal(2).add(null));
    }

    public String longestCommonPrefix(String[] str) throws Exception {
        StringBuilder result = new StringBuilder();
        if (str.length != 0) {
            int i = 0;
            boolean b = true;
            while (b) {
                try {
                    char c = '1';
                    for (int j = 0; j < str.length; j++) {
                        if (j == 0) {
                            c = str[0].charAt(i);
                        }
                        if (c != str[j].charAt(i)) {
                            b = false;
                            break;
                        }
                        if (j == str.length - 1) {
                            result.append(c);
                        }
                    }
                } catch (Exception e) {
                    b = false;
                }
                i++;
            }
        }
        return result.toString();
    }
}
