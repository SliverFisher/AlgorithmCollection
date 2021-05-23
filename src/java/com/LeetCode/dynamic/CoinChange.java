package com.LeetCode.dynamic;

/**
 * @Author:Wendy
 * @Date:2021/5/23 18:31
 */
public class CoinChange {
    public static void main(String[] args) {
        int[] a = new int[]{2, 5, 7};
        System.out.println(new CoinChange().coinChange(a, 27));
    }

    /***
     *1.确定关系：f[x]=min(f[x-2]+1,f[x-5]+1,f[x-7]+1)
     *2.以上为转移方程
     *3.关于边界。f[0]=0;
     */

    public int coinChange(int[] coins, int amount) {
        int[] f = new int[amount + 1];
        f[0] = 0;
        for (int i = 1; i < amount + 1; i++) {
            f[i] = Integer.MAX_VALUE;
            for (int j = 0; j < coins.length; j++) {
                if (i >= coins[j] && f[i - coins[j]] != Integer.MAX_VALUE)
                    f[i] = Math.min(f[i - coins[j]] + 1, f[i]);
            }
        }
        if (f[amount] == Integer.MAX_VALUE) {
            f[amount] = -1;
        }
        return f[amount];
    }
}
