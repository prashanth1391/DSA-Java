package com.dsa.binarysearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {4, 6, 8, 9, 12, 18, 22};
        System.out.println(doBinarySearch(arr, 7));
    }

//{4, 6, 8, 9, 12, 18, 22};
    private static boolean doBinarySearch(int arr[],int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
           int mid = start + (end-start)/2;
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
