package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

/***
 *
 * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.
 * A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
 *
 * Example 1:
 *
 * Input: digits = "23"
 * Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
 *
 * Example 2:
 * Input: digits = ""
 * Output: []
 *
 * Example 3:
 * Input: digits = "2"
 * Output: ["a","b","c"]
 */

public class LetterCombinationsOfAPhoneNumber {
    /***
     * 回溯法
     */


    public static void main(String[] args) {
        System.out.println(new LetterCombinationsOfAPhoneNumber().letterCombinations("23"));
    }

    public List<String> letterCombinations(String digits) {
        ArrayList<String> temp = new ArrayList<>();
        if (!digits.isEmpty()) {
            char[] array = getArray(digits.charAt(digits.length() - 1) - '2');
            List<String> list = letterCombinations(digits.substring(0, digits.length() - 1));
            if (!list.isEmpty()) {
                list.forEach(x -> {
                            for (int i = 0; i < array.length; i++) {
                                temp.add(x + array[i]);
                            }
                        }
                );
            } else {
                for (int i = 0; i < array.length; i++) {
                    temp.add(String.valueOf(array[i]));
                }
            }
        }
        return temp;
    }

    private char[] getArray(int num) {
        char[] array;
        switch (num) {
            case 0:
                array = new char[]{'a', 'b', 'c'};
                break;
            case 1:
                array = new char[]{'d', 'e', 'f'};
                break;
            case 2:
                array = new char[]{'g', 'h', 'i'};
                break;
            case 3:
                array = new char[]{'j', 'k', 'l'};
                break;
            case 4:
                array = new char[]{'m', 'n', 'o'};
                break;
            case 5:
                array = new char[]{'p', 'q', 'r', 's'};
                break;
            case 6:
                array = new char[]{'t', 'u', 'v'};
                break;
            case 7:
                array = new char[]{'w', 'x', 'y', 'z'};
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + num);
        }
        return array;
    }

}
