package com.dsa.binarysearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {4, 6, 8, 9, 12, 18, 22, 35, 41, 55, 60};
        System.out.println(doBinarySearch(arr, 606));
    }

    // Below method is combination of binary and linear search
    private static boolean search1(int[] arr, int target) {
        int start = 0;
        int end = arr.length;
        int mid = (start + end) / 2;
        if (arr[mid] == target)
            return true;
        if (arr[mid] > target) {
            start = 0;
            end = mid - 1;
        } else {
            start = mid + 1;
            end = arr.length;
        }
        for (int i = start; i < end; i++) {
            if (arr[i] == target)
                return true;
        }
        return false;
    }
//{4, 6, 8, 9, 12, 18, 22, 35, 41, 55, 60};
    private static boolean doBinarySearch(int arr[],int target){
        int start = 0;
        int end = arr.length-1;
        System.out.println(end);
        int mid =0;
        while(start<=end){
            mid = start + (end-start)/2;
//            mid = (start + end)/2;
            if(arr[mid] == target){
                System.out.println("Element found : " +arr[mid] +" at the position : "+mid);
                return true;
            }
            if(arr[mid]>target)
                end = mid -1;
            else
                start = mid +1;
        }
        System.out.println("Element not found");
        return false;
    }

}
