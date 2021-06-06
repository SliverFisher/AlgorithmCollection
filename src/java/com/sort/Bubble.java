package com.sort;


import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class Bubble {
    public static void main(String[] args) {
        System.out.println(new Bubble().sort(AbstractSort.PHONE_NUMBER));
    }

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
