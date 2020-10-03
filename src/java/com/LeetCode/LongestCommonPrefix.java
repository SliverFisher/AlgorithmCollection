package com.LeetCode;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(new LongestCommonPrefix().longestCommonPrefix(new String[]{"sss","s222","s"}));
    }
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        if (strs.length != 0) {
            int i = 0;
            boolean b = true;
            while (b) {
                try {
                    char c = '1';
                    for (int j = 0; j < strs.length; j++) {
                        if (j == 0) {
                            c = strs[0].charAt(i);
                        }
                        if (c != strs[j].charAt(i)) {
                            b = false;
                            break;
                        }
                        if (j == strs.length - 1) {
                            result = result + c;
                        }
                    }
                } catch (Exception e) {
                    b = false;
                }
                i++;
            }
        }
        return result;
    }
}
