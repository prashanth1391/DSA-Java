package com.dsa.binarysearch;

import java.util.Arrays;

public class FindLargestSumInArray {
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        Arrays.sort(arr);
        System.out.println(arr[(arr.length-1)] + arr[(arr.length-2)]);
        System.out.println(Arrays.toString(arr));
    }
}
