package com.sort;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class Insertion {
    public static void main(String[] args) {
        System.out.println(new Insertion().sort(AbstractSort.PHONE_NUMBER));
    }

    public String sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int select = array[i];
            int index = i - 1;
            while (index >= 0 && array[index] > select) {
                array[index + 1] = array[index];
                index--;
            }
            array[index + 1] = select;
        }
        return Arrays.toString(array);
    }
}
