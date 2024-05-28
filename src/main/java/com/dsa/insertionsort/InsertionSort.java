package com.dsa.insertionsort;

import java.util.Arrays;

public class InsertionSort {

    static int[] arr = {4,5,3,1,2};

    public static void main(String[] args) {
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {
        for(int i =0;i<arr.length-1;i++){
            for(int j = i+1 ;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else {
                    break;
                }
            }
        }
    }

    static void swap(int[] arr, int start, int second){

        int temp = arr[start];
        arr[start] = arr[second];
        arr[second] = temp;

    }
}
