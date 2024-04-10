package com.dsa.bubblesort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        doBubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void doBubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean isSwapped = false;
            System.out.println("i loop runs : " + i);
            for (int j = 1; j < arr.length - i; j++) {
                System.out.println("j loop runs : " + j);
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped)
                break;
        }
    }


}
