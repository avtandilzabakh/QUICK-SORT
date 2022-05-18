package com.company;

import java.sql.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[]arr = {1,2,3,4,5};
        quickSort(arr,0,arr.length - 1);

        System.out.println( Arrays.toString(arr));
    }

    public static void quickSort(int[] array, int p, int r) {
        if (p < r) {
            int q = partition(array, p, r);
            quickSort(array, p, q - 1);
            quickSort(array, p + 1, r);
        }


    }

    public static int partition(int[] array, int p, int r) {
        int x = array[r];
        int i = p - 1;
        for (int j = p; j < r - 1; j++) {
            if (array[j] <= x) {
                i++;
                swap(array, i, j);

            }
        }
        swap(array, i + 1, r);
        return i + 1;
    }

    public static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

}
