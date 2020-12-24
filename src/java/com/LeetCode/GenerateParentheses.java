package com.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/***
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 *
 *
 *
 * Example 1:
 * Input: n = 3
 * Output: ["((()))","(()())","(())()","()(())","()()()"]
 *
 * Example 2:
 * Input: n = 1
 * Output: ["()"]
 *
 *
 * Constraints:
 *
 * 1 <= n <= 8
 */
public class GenerateParentheses {
    private char left = '(';
    private char right = ')';

    public static void main(String[] args) {
        System.out.println(new GenerateParentheses().generateParenthesis(4));
    }

    public List<String> generateParenthesis(int n) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<int[]> result = new ArrayList<>();
        char[] chars = new char[n];
        Arrays.fill(chars, left);
        for (int i = 1; i <= n; i++) {
            int[] array = new int[n];
            array[n - 1] = i;
            insertR(array, n - 2, n - i, n, Math.max((2 - i), 0), result);
        }
        result.forEach(x -> {
            char[] temp = new char[n * 2];
            temp[0] = left;
            int index = 0;
            for (int i = 0; i < x.length; i++) {
                for (int j = 0; j < x[i]; j++) {
                    index++;
                    temp[index] = right;
                }
                index++;
                if (index < (n * 2))
                    temp[index] = left;
            }
            list.add(new String(temp));

        });
        return list;
    }

    /***
     * 插入左
     *
     */

    private void insertR(int[] array, int insertIndex, int insertNumber, int n, int leastInsert, ArrayList<int[]> list) {
        if (insertNumber == 0) {
            list.add(array);
            return;
        }
        if (insertIndex == 0) {
            array[0] = insertNumber;
            list.add(array);
            return;
        }
        for (int i = leastInsert; i <= insertNumber; i++) {
            array[insertIndex] = i;
            int[] temp = Arrays.copyOf(array, array.length);
            insertIndex--;
            insertR(array, insertIndex, insertNumber - i, n, Math.max((insertNumber - i - insertIndex), 0), list);
            insertIndex++;
            array = temp;

        }
    }

}
