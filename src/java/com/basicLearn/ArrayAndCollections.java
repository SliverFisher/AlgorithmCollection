package com.basicLearn;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayAndCollections {
    public static void main(String[] args) {
        int[] numArray = new int[2];
        System.out.println(numArray.length);
        int[][] numArray2 = new int[5][3];
        System.out.println(numArray2.length);
        ArrayList<Integer> list = new ArrayList<>(2);
        System.out.println();
    }

    private void HashTest() {
        HashMap<String, String> map = new HashMap();
        map.put("01", null);
    }

    private void method01() {
        //第一种
        int[] is = new int[3];
        is[0] = 1;
        is[1] = 2;
        is[2] = 3;
        //第二种
        int[] is2 = {1, 2, 3};
        //第三种
        int[] is3 = new int[]{1, 2, 3};
    }
}
