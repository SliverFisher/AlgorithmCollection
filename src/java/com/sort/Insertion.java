package com.sort;

import java.util.Arrays;

public class Insertion implements AbstractSort {
    public static void main(String[] args) {
        System.out.println(new Insertion().sort(array));
    }

    @Override
    public String sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int select = array[i];
            int index = i - 1;
            while (index >= 0 && array[index] > select) {
                array[index + 1] = array[index];
                index--;
            }
            array[index+1] = select;
        }
        return Arrays.toString(array);
    }
}
