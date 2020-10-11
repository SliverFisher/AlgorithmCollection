package com.LeetCode;

public class StringToInteger {
    public static void main(String[] args) {
        System.out.println(new StringToInteger().myAtob("-190"));
    }

    public int myAtob(String s) {
        s = s.trim();
        char[] c = s.toCharArray();
        if (s == null || s.equals(""))
            return 0;
        if ((c[0] >= 48 && c[0] <= 57) || (c[0] == 45 || c[0] == 43)) {
            if (c.length > 1) {
                if ((c[0] == 45 || c[0] == 43) && !(c[1] >= 48 && c[1] <= 57)) {
                    return 0;
                }
            }
        } else {
            return 0;
        }
        boolean showNum = false;
        boolean showAR = false;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < c.length; i++) {
            if (c[i] == 46)
                break;
            if ((c[i] >= 48 && c[i] <= 57) || (c[i] == 45 || c[i] == 43)) {
                if ((c[i] == 45 || c[i] == 43) && !showAR) {
                    showAR = true;
                } else {
                    if ((c[i] == 45 || c[i] == 43)) {
                        break;
                    } else {
                        showNum = true;
                    }
                }
                if (showNum && (c[i] == 45 || c[i] == 43))
                    break;
                stringBuilder.append(c[i]);
            } else {
                break;
            }
        }
        String temp = stringBuilder.toString();
        boolean isUp = temp.charAt(0) != 45;
        int result = 0;
        try {
            result = Integer.parseInt(temp);
            ;
        } catch (Exception e) {
            if (temp.equals("-") || temp.equals("+"))
                return 0;

            if (isUp)
                return Integer.MAX_VALUE;
            else return Integer.MIN_VALUE;
        }
        return result;
    }
}
