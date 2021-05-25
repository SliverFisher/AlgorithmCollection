package com.LeetCode.dynamicProgramic;

/**
 * @Author:Wendy
 * @Date:2021/5/25 16:32
 * <p>
 * <p>
 * 1.确定状态：dp[m][n]  ,m x n个框框的路径,初始的dp[m][1]=1,d[1][n]=1
 * 2.转移方程 dp[m][n]=d[m-1][n]+dp[m][n-1]
 */
public class UniquePathsII {
    public static void main(String[] args) {
        int[][] arrays = new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        int[][] arrays2 = new int[][]{{1, 0}};
        System.out.println(new UniquePathsII().uniquePathsWithObstacles(arrays2));
    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i < m + 1; i++) {
            if (obstacleGrid[i - 1][0] == 1) {
                for (int j = 1; j < m + 1; j++) {
                    dp[i][1] = 0;
                }
                break;
            } else {
                dp[i][1] = 1;
            }
        }
        for (int i = 1; i < n + 1; i++) {
            if (obstacleGrid[0][i - 1] == 1) {
                for (int j = 1; j < n + 1; j++) {
                    dp[1][i] = 0;
                }
                break;
            } else {
                dp[1][i] = 1;
            }
        }
        for (int i = 2; i < m + 1; i++) {
            for (int j = 2; j < n + 1; j++) {
                dp[i][j] = obstacleGrid[i - 1][j - 1] == 1 ? 0 : dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m][n];
    }
}
