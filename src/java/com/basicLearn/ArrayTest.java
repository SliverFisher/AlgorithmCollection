package com.basicLearn;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int[] array=new int[]{1,2,3};
        change(array);
        System.out.println(Arrays.toString(array));
    }

    private static void change(int[] array) {
        array[0]=444;
    }
}
