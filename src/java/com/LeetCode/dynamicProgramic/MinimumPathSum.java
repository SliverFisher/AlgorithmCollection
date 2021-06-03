package com.LeetCode.dynamicProgramic;

/**
 * @Author:Wendy
 * @Date:2021/5/25 16:52
 * <p>
 * <p>
 * 1.确定状态：dp[m][n]  ,m x n个框框的路径,初始的dp[m][1]=1,d[1][n]=1
 * 2.转移方程 dp[m][n]=d[m-1][n]+dp[m][n-1]
 */
public class MinimumPathSum {
    public static void main(String[] args) {
        int[][] arrays = new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        System.out.println(new MinimumPathSum().minPathSum(arrays));
    }

    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i < m + 1; i++) {
            dp[i][1] = grid[i - 1][0] + dp[i - 1][1];
        }
        for (int i = 1; i < n + 1; i++) {
            dp[1][i] = grid[0][i - 1] + dp[1][i - 1];
        }
        for (int i = 2; i < m + 1; i++) {
            for (int j = 2; j < n + 1; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i - 1][j - 1];
            }
        }
        return dp[m][n];
    }
}
