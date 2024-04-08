package com.dsa.linearsearch;

public class SearchInRange {

    static int doSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) return -1;
        for (int i = start; i < end; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {56, 895, 54, 2, 5, 6, 8};
        System.out.println(doSearch(arr, 54, 1, 3));
    }
}
