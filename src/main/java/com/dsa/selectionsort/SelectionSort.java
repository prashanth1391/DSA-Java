package com.dsa.selectionsort;

import java.util.Arrays;

public class SelectionSort {

    static int[] arr = {4,5,3,1,2};

    public static void main(String[] args) {
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr){
        for(int i = 0; i<arr.length;i++){
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }
    static int getMaxIndex(int[] arr,int start, int last){
        int max = start;
        for(int i=start;i<=last;i++){
            if(arr[max]<arr[i])
                max = i;
        }
        return max;
    }
    static void swap(int[] arr, int start, int second){

        int temp = arr[start];
        arr[start] = arr[second];
        arr[second] = temp;

    }
}
