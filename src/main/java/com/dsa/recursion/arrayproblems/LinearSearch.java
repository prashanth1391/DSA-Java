package com.dsa.recursion.arrayproblems;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {4,7,9,11,10};
        int target = 12;
        System.out.println(isElementPresent(arr,target));
    }

    private static boolean isElementPresent(int[] arr, int target) {
        return helper(arr,0,target);
    }

    private static boolean helper(int[] arr, int i, int target) {
        if (i == arr.length) {
            return false;
        }
        if (arr[i] == target) {
            return true;
        } else {
            return helper(arr, i + 1, target);
        }
    }

}
