package com.dsa.recursion.arrayproblems;

public class LinearSearchReturnIndex {
    public static void main(String[] args) {
        int[] arr = {4, 7, 9, 11, 10};
        int target = 12;
        System.out.println(isElementPresent(arr, target));
    }

    private static int isElementPresent(int[] arr, int target) {
        return helper(arr, 0, target);
    }

    private static int helper(int[] arr, int i, int target) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == target) {
            return i;
        } else {
            return helper(arr, i + 1, target);
        }
    }

}
