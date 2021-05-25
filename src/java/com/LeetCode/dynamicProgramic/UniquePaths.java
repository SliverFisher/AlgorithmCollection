package com.LeetCode.dynamicProgramic;

/**
 * 1.确定状态：dp[m][n]  ,m x n个框框的路径,初始的dp[m][1]=1,d[1][n]=1
 * 2.转移方程 dp[m][n]=d[m-1][n]+dp[m][n-1]
 */
public class UniquePaths {

    public static void main(String[] args) {
        System.out.println(new UniquePaths().uniquePaths(3, 7));
    }

    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i < m + 1; i++) {
            dp[i][1] = 1;
        }
        for (int i = 1; i < n + 1; i++) {
            dp[1][i] = 1;
        }
        for (int i = 2; i < m + 1; i++) {
            for (int j = 2; j < n + 1; j++) {
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m][n];
    }
}
