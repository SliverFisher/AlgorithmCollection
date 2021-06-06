package com.sort;

import org.springframework.stereotype.Component;

@Component
public interface AbstractSort {
    int[] PHONE_NUMBER = new int[]{1, 5, 6, 7, 5, 1, 0, 3, 1, 4, 4};
    int[] array = new int[]{1, 2, 4, 55, 66, 77, 0, 3, 23, 42, 765};


    static int[] getRandomArray(int arraySize) {
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = (int) (Math.random() * arraySize);
        }
        return array;
    }


}
