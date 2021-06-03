package com.sort;

import java.util.Arrays;

public class Quick implements AbstractSort {
    public static void main(String[] args) {
        System.out.println(new Quick().sort(array));
        System.out.println("-----");
        System.out.println(Arrays.toString(qsort(array, 0, array.length - 1)));
    }

    @Override
    public String sort(int[] array) {
        quickSort(array, 0, array.length - 1);
        return Arrays.toString(array);
    }

    private void quickSort(int[] array, int start, int end) {
        int k = (end-start)/2+start;

        int selectValue = array[k];
        int first = start;
        int last = end;
        while (last > first) {
            while (last > first && selectValue < array[last]) {
                last--;
            }
            while (first < last && selectValue > array[first]) {
                first++;
            }
            if (array[first] == array[last] && last > first) {
                first++;
            } else {
                System.out.println("------------");
                System.out.println("first="+first);
                System.out.println("last="+last);
                System.out.println(Arrays.toString(array));
                int temp = array[first];
                array[first] = array[last];
                array[last] = temp;
                System.out.println(Arrays.toString(array));
                System.out.println("");
                System.out.println("------------");
            }
        }
        if (first - 1 > start) quickSort(array, start, first - 1);
        if (end > first + 1) quickSort(array, first + 1, end);
    }

    public static int[] qsort(int arr[], int start, int end) {
        int pivot = arr[start];
        int i = start;
        int j = end;
        while (i < j) {
            while ((i < j) && (arr[j] > pivot)) {
                j--;
            }
            while ((i < j) && (arr[i] < pivot)) {
                i++;
            }
            if ((arr[i] == arr[j]) && (i < j)) {
                i++;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        if (i - 1 > start) arr = qsort(arr, start, i - 1);
        if (j + 1 < end) arr = qsort(arr, j + 1, end);
        return (arr);
    }
}
