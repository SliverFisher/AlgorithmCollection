package com.sort;


import java.util.Arrays;

public class Bubble implements AbstractSort {
    public static void main(String[] args) {
        System.out.println(new Bubble().sort(PHONE_NUMBER));
    }

    @Override
    public String sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }

        return Arrays.toString(array);
    }
}
