package com.classic;

import java.util.ArrayList;
import java.util.List;

public class EightQueen {
    public static int sum = 0;
    public static int checkSum = 0;
    public static ArrayList<String> pan = new ArrayList<>();

    public static void main(String[] args) {
        pan.add("00000000");
        pan.add("00000000");
        pan.add("00000000");
        pan.add("00000000");
        pan.add("00000000");
        pan.add("00000000");
        pan.add("00000000");
        pan.add("00000000");
        new EightQueen().findNode(0);
        System.out.println("八皇后解法"+sum);
        System.out.println("八皇后解法检查算法执行次数"+checkSum);
    }

    /*
    八皇后问题：
    1.递归思路：
    一。每一次插入一个皇后，所排出的行和列的规则一致
    二。递归结束条件，最后一列row=8时候，结束
    三。找出符合条件或者不符合条件
    四。检查条件，用来剪枝
    五。路漫漫其修远兮
     */


    private void findNode(int row) {
        if (row == 8) {
            //成功条件
            sum++;
        } else {
            for (int col = 0; col < 8; col++) {
                if (check(pan, row,col)) {
                    char[] temp = pan.get(row).toCharArray();
                    temp[col] = '1';
                    pan.set(row, new String(temp));
                    findNode(row + 1);
                    //进入递归
                    pan.set(row, "00000000");
                    //清除上一次递归的影响
                }
            }
        }
    }

    //检查条件
    private boolean check(List<String> list, int row, int col) {
        checkSum++;
        boolean result = true;
        if (list.get(row).contains("1")) {
            result = false;
        }
        //行检查
        for (int i = 0; i < list.size(); i++) {
            int position = list.get(i).indexOf("1");
            if (position == -1)
                continue;
            if (position == col) {
                result = false;
            }
            //列检查
            if (Math.abs(row - i) == Math.abs(col - position)) {
                result = false;
            }
            //对角检查
        }
        //列检查和对角检查
        return result;
    }
}
