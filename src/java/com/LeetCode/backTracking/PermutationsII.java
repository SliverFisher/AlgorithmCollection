package com.LeetCode.backTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/***
 * Given a collection of numbers, nums, that might contain duplicates, return all possible unique permutations in any order.
 *
 * Example 1:
 * Input: nums = [1,1,2]
 * Output:
 * [[1,1,2],
 *  [1,2,1],
 *  [2,1,1]]
 *
 * Example 2:
 * Input: nums = [1,2,3]
 * Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 *
 * Constraints:
 * 1 <= nums.length <= 8
 * -10 <= nums[i] <= 10
 */
public class PermutationsII {
    public static void main(String[] args) {
        int[] array = new int[]{3, 3, 0, 3};
        System.out.println(new PermutationsII().permuteUnique(array));
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        track(nums, result, new ArrayList<>(), new boolean[nums.length]);
        return result;
    }

    private void track(int[] nums, List<List<Integer>> result, ArrayList<Integer> integers, boolean[] used) {
        if (integers.size() == nums.length) {
            result.add(List.copyOf(integers));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i])
                continue;
            integers.add(nums[i]);
            used[i] = true;
            track(nums, result, integers, used);
            integers.remove(integers.size() - 1);
            used[i] = false;
            while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                i++;
            }
        }
    }
}
