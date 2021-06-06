package com.sort;

import java.util.Arrays;

public class Quick implements AbstractSort {
    public static void main(String[] args) {
        quickSort(PHONE_NUMBER, 0, PHONE_NUMBER.length - 1);
        System.out.println(Arrays.toString(PHONE_NUMBER));
    }

    @Override
    public String sort(int[] array) {
        quickSort(array, 0, array.length - 1);
        return Arrays.toString(array);
    }

    /****
     * 代码思想，先把基准值移到边界，最后，再调回来
     * @param array
     * @param start
     * @param end
     */

    private static void quickSort(int[] array, int start, int end) {
        int k = (start + end) / 2;
        int selectValue = array[k];
        int first = start;
        int last = end;
        swap(array, first, k);
        while (last > first) {
            while (last > first && selectValue < array[last]) {
                last--;
            }
            while (first < last && selectValue >= array[first]) {
                first++;
            }
            if (last <= first) {
                swap(array, start, last);
                break;
            } else {
                swap(array, first, last);
            }
        }
        if (first - 1 > start) quickSort(array, start, first - 1);
        if (end > first + 1) quickSort(array, first + 1, end);
    }

    private static void swap(int[] array, int start, int last) {
        int temp = array[start];
        array[start] = array[last];
        array[last] = temp;
    }

}
