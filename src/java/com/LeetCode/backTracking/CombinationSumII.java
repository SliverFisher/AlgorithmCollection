package com.LeetCode.backTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/***
 * Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sum to target.
 * Each number in candidates may only be used once in the combination.
 * Note: The solution set must not contain duplicate combinations.
 *
 *
 *
 * Example 1:
 * Input: candidates = [10,1,2,7,6,1,5], target = 8
 * Output:
 * [
 * [1,1,6],
 * [1,2,5],
 * [1,7],
 * [2,6]
 * ]
 *
 * Example 2:
 * Input: candidates = [2,5,2,1,2], target = 5
 * Output:
 * [
 * [1,2,2],
 * [5]
 * ]
 *
 *
 * Constraints:
 * 1 <= candidates.length <= 100
 * 1 <= candidates[i] <= 50
 * 1 <= target <= 30
 */
public class CombinationSumII {
    public static void main(String[] args) {
        int[] array = new int[]{10, 1, 2, 7, 6, 1, 5};
        System.out.println(new CombinationSumII().combinationSum2(array, 8));
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        trace(target, candidates.length - 1, candidates, result, new ArrayList<>());
        return result;
    }

    private void trace(int target, int index, int[] ints, List<List<Integer>> result, ArrayList<Integer> temp) {
        if (0 == target) {
            ArrayList<Integer> list = new ArrayList<>(temp);
            //   if (!result.contains(list))
            result.add(list);
        } else if (0 < target) {
            for (int i = index; i >= 0; i--) {
                if (ints[i] > target)
                    continue;
                temp.add(ints[i]);
                trace(target - ints[i], i - 1, ints, result, temp);
                temp.remove(temp.size() - 1);
                while (i > 0 && ints[i] == ints[i - 1]) {
                    i--;
                }
            }
        }
    }
}
