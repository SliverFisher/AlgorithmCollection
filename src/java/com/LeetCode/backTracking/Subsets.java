package com.LeetCode.backTracking;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        int[] arrays = new int[]{1, 2, 3, 4};
        System.out.println(new Subsets().subsets(arrays));
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i <= nums.length; i++) {
            int[] array = new int[i];
            track(i, 0, nums, result, array, 0);
        }
        return result;
    }

    private void track(int k, int index, int[] nums, List<List<Integer>> result, int[] integers, int count) {
        if (count == k) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int integer : integers) {
                arrayList.add(integer);
            }
            result.add(arrayList);
            return;
        }
        for (int i = index; i < nums.length; i++) {
            integers[count] = nums[i];
            track(k, i + 1, nums, result, integers, count + 1);
        }
    }
}
