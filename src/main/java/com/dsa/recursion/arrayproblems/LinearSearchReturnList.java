package com.dsa.recursion.arrayproblems;

import java.util.ArrayList;

public class LinearSearchReturnList {
    public static void main(String[] args) {
        int[] arr = {4,6,8,6,9};
        int target = 6;
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(isElementPresent(arr, target,list));
    }
    private static ArrayList<Integer> isElementPresent(int[] arr, int target, ArrayList<Integer> list) {
        return helper(arr, 0, target,list);
    }

    private static ArrayList<Integer> helper(int[] arr, int i, int target, ArrayList<Integer> list) {
        if (i == arr.length) {
            return list;
        }
        if (arr[i] == target) {
            list.add(i);
        }
        return helper(arr, i + 1, target, list);
    }

}
