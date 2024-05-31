package com.dsa.recursion.arrayproblems;

public class CheckArraySorted {
    public static void main(String[] args) {
        int[] arr = {4,7,9,11,10};
        System.out.println(isArraySorted(arr));
    }

    private static boolean isArraySorted(int[] arr) {
        return helper(arr,0);
    }

    private static boolean helper(int[] arr, int i) {
        if(i==arr.length-1){
            return true;
        }
        return arr[i] < arr[i+1] && helper(arr,i+1);
    }
}
