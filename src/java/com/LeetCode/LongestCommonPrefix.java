package com.LeetCode;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(new LongestCommonPrefix().longestCommonPrefix(new String[]{"sss","s222","s"}));
    }
    public String longestCommonPrefix(String[] str) {
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
