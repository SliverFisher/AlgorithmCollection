package com.sort;


import java.util.Arrays;

public class Shell implements AbstractSort {
    public static void main(String[] args) {
        System.out.println(new Shell().sort(PHONE_NUMBER));
    }

    @Override
    public String sort(int[] array) {
        int gap = array.length / 2;
        for (int i = gap; 0 < i; i /= 2) {
            for (int j = 0; j < array.length; j++) {
                if (j + i < array.length) {
                    if (array[j] > array[j + i]) {
                        for (int k = j + 1; k <= i + j; k++) {
                            int selectValue = array[k];
                            int index = k - 1;
                            while (index >= j && array[index] > selectValue) {
                                array[index + 1] = array[index];
                                index--;
                            }
                            array[index + 1] = selectValue;
                        }
                    }
                }
            }

        }
        return Arrays.toString(array);
    }
}

