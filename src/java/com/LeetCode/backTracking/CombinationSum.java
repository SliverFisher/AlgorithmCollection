package com.LeetCode.backTracking;

import java.util.ArrayList;
import java.util.List;

/***
 *Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.
 * The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the frequency of at least one of the chosen numbers is different.
 * It is guaranteed that the number of unique combinations that sum up to target is less than 150 combinations for the given input.
 *
 * Example 1:
 * Input: candidates = [2,3,6,7], target = 7
 * Output: [[2,2,3],[7]]
 *
 * Explanation:
 * 2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
 * 7 is a candidate, and 7 = 7.
 * These are the only two combinations.
 *
 * Example 2:
 * Input: candidates = [2,3,5], target = 8
 * Output: [[2,2,2,2],[2,3,3],[3,5]]
 *
 * Example 3:
 * Input: candidates = [2], target = 1
 * Output: []
 *
 * Example 4:
 * Input: candidates = [1], target = 1
 * Output: [[1]]
 *
 * Example 5:
 * Input: candidates = [1], target = 2
 * Output: [[1,1]]
 *
 * Constraints:
 * 1 <= candidates.length <= 30
 * 1 <= candidates[i] <= 200
 * All elements of candidates are distinct.
 * 1 <= target <= 500
 */
public class CombinationSum {
    public static void main(String[] args) {
        int[] array = new int[]{2, 4, 6, 8};
        System.out.println(new CombinationSum().combinationSum(array, 12));
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        trace(target, candidates.length - 1, candidates, result, new ArrayList<>());
        return result;
    }

    private void trace(int target, int index, int[] ints, List<List<Integer>> result, ArrayList<Integer> temp) {
        if (index < 0)
            return;
        if (0 == target) {
            result.add(new ArrayList<>(temp));
        } else if (0 < target) {
            for (int i = index; i >= 0; i--) {
                if (ints[i] > target)
                    continue;
                temp.add(ints[i]);
                trace(target - ints[i], i, ints, result, temp);
                temp.remove(temp.size() - 1);
            }
        }
    }

    private int checkOutOfBounds(List<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }


}
