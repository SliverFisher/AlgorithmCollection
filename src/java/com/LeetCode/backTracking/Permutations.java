package com.LeetCode.backTracking;

import java.util.ArrayList;
import java.util.List;

/***
 * Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.
 * Example 1:
 * Input: nums = [1,2,3]
 * Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 *
 * Example 2:
 * Input: nums = [0,1]
 * Output: [[0,1],[1,0]]
 *
 * Example 3:
 * Input: nums = [1]
 * Output: [[1]]
 *
 * Constraints:
 * 1 <= nums.length <= 6
 * -10 <= nums[i] <= 10
 * All the integers of nums are unique.
 */
public class Permutations {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3,4};
        System.out.println(new Permutations().permute(array));
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        track(nums, result, new ArrayList<>());
        return result;
    }

    private void track(int[] nums, List<List<Integer>> result, ArrayList<Integer> integers) {
        if (integers.size() == nums.length) {
            result.add(List.copyOf(integers));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (integers.contains(nums[i]))
                continue;
            integers.add(nums[i]);
            track(nums, result, integers);
            integers.remove(integers.size() - 1);
        }

    }
}
