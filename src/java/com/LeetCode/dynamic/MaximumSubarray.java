package com.LeetCode.dynamic;

import java.lang.reflect.Array;

/**
 * @Author:Wendy
 * @Date:2021/5/23 22:32
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 * <p>
 * Example 1:
 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 * <p>
 * <p>
 * <p>
 * Example 2:
 * Input: nums = [1]
 * Output: 1
 * <p>
 * Example 3:
 * Input: nums = [5,4,-1,7,8]
 * Output: 23
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 3 * 104
 * -105 <= nums[i] <= 105
 */
public class MaximumSubarray {
    public static void main(String[] args) {
        int[] array = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(new MaximumSubarray().maxSubArray(array));
    }

    /***
     *
     * 1.确定关系：dp[i] = max{num[i],dp[i-1] + num[i]},表示以第i个元素结尾的最大子序列
     *
     * 2.边界f[i][i]=num[i];
     */

    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(nums[i], nums[i] + dp[i - 1]);
        }
        int res = dp[0];
        for (int i = 1; i < dp.length; i++) {
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}
