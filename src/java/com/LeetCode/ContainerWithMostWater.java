package com.LeetCode;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        System.out.println(new ContainerWithMostWater().MaxArea(new int[]{2, 2, 34, 45, 1}));
    }

    public int MaxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length - 1;
        while (right > left) {
            int temp = (right - left) * (Math.min(height[left], height[right]));
            max = Math.max(temp, max);
            if (height[left] > height[right]) {
                right--;
            } else {
                left++;
            }
        }
        return max;
    }
}
