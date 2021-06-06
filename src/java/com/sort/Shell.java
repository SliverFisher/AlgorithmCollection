package com.sort;


import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class Shell {
    public static void main(String[] args) {
        System.out.println(new Shell().sort(AbstractSort.PHONE_NUMBER));
    }

    public String sort(int[] array) {
        for (int gap = array.length / 2; 0 < gap; gap /= 2) {
            for (int o = 0; o + gap <= array.length / 2; o++) {
                for (int j = gap + o; j < array.length; j += (gap + o)) {
                    int select = array[j];
                    int index = j - gap;
                    while (index >= o && array[index] > select) {
                        array[index + gap] = array[index];
                        index -= gap;
                    }
                    array[index + gap] = select;
                }
            }


        }
        return Arrays.toString(array);
    }

}

