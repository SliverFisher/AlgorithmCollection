package com.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(new RomanToInteger().romanToInt("VI"));
    }

    public int romanToInt(String s) {
        int result = 0;
        List<Character> ls0 = new ArrayList<>(Arrays.asList('M', 'D', 'C', 'L', 'X', 'V', 'I'));
        List<Integer> ls1 = new ArrayList<>(Arrays.asList(1000, 500, 100, 50, 10, 5, 1));
        char[] c = s.toCharArray();
        int first;
        int second;
        for (int i = 0; i < c.length; i++) {
            first = ls1.get(ls0.indexOf(c[i]));
            if ((i + 1) < c.length) {
                second = ls1.get(ls0.indexOf(c[i + 1]));
                if (first < second) {
                    result += second;
                    result -= first;
                    i++;
                    continue;
                }
            }
            result += first;
        }
        return result;
    }
}
