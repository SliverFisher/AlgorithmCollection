package com.LeetCode;

import java.util.Arrays;

public class ThreeSunClosest {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, -1, -3};
        System.out.println(new ThreeSunClosest().threeSumClosest(array, -3));
    }

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int minDistance = Integer.MAX_VALUE;
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int threeSum = nums[i] + nums[left] + nums[right];
                if (threeSum == target) {
                    return threeSum;
                }
                if (threeSum < target) {
                    left++;
                }
                if (threeSum > target) {
                    right--;
                }
                int curDistance = Math.abs(threeSum - target);
                if (curDistance < minDistance) {
                    minDistance = curDistance;
                    result = threeSum;
                }
            }
        }
        return result;
    }
}
