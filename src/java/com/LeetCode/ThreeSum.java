package com.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5,-1,-3};
        System.out.println(new ThreeSum().threeSum(array));
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ls = new ArrayList<>();
        Arrays.sort(nums);
        int first = -1;
        int second = -1;
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0) {
                if (nums[i - 1] == nums[i])
                    continue;
            }
            first = i + 1;
            second = nums.length - 1;
            while (first < second) {
                List<Integer> temp = new ArrayList<>();
                int result = nums[first] + nums[second] + nums[i];
                if (result == 0) {

                    temp.add(nums[i]);
                    temp.add(nums[first]);
                    temp.add(nums[second]);
                    ls.add(temp);
                    while (first < second) {
                        first++;
                        if (nums[first] != temp.get(1))
                            break;
                    }
                } else if (result > 0) {
                    second--;
                } else {
                    first++;
                }
            }
        }
        return ls;
    }

}
