package com.LeetCode.backTracking;

import java.util.ArrayList;
import java.util.List;

/***
 * Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.
 * You may return the answer in any order.
 *
 * Example 1:
 * Input: n = 4, k = 2
 * Output:
 * [
 *   [2,4],
 *   [3,4],
 *   [2,3],
 *   [1,2],
 *   [1,3],
 *   [1,4],
 * ]
 *
 * Example 2:
 * Input: n = 1, k = 1
 * Output: [[1]]
 *
 *
 * Constraints:
 * 1 <= n <= 20
 * 1 <= k <= n
 */
public class Combinations {
    public static void main(String[] args) {
        System.out.println(new Combinations().combine(4, 2));
    }

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        int[] array = new int[k];
        track(k, 1, n, result, array, 0);
        return result;
    }

    private void track(int k, int index, int n, List<List<Integer>> result, int[] integers, int count) {
        if (count == k) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int integer : integers) {
                arrayList.add(integer);
            }
            result.add(arrayList);
            return;
        }
        for (int i = index; i <= n; i++) {
            integers[count] = i;
            track(k, i + 1, n, result, integers, count + 1);
        }
    }
}
