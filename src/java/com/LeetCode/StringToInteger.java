package com.LeetCode;

public class StringToInteger {
    public static void main(String[] args) {
        System.out.println(new StringToInteger().myAtob("-190"));
    }

    public int myAtob(String s) {
        if (s == null || s.equals(""))
            return 0;
        s = s.trim();
        char[] c = s.toCharArray();
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
        for (char value : c) {
            if (value == 46)
                break;
            if ((value >= 48 && value <= 57) || (value == 45 || value == 43)) {
                if ((value == 45 || value == 43) && !showAR) {
                    showAR = true;
                } else {
                    if ((value == 45 || value == 43)) {
                        break;
                    } else {
                        showNum = true;
                    }
                }
                if (showNum && (value == 45 || value == 43))
                    break;
                stringBuilder.append(value);
            } else {
                break;
            }
        }
        String temp = stringBuilder.toString();
        boolean isUp = temp.charAt(0) != 45;
        int result;
        try {
            result = Integer.parseInt(temp);
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
