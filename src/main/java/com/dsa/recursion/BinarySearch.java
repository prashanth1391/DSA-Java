package com.dsa.recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {3,8,4,66,45,78};
        int target = 45;
        System.out.println(binarySearch(arr,target,0,arr.length-1));
    }

    private static int binarySearch(int[] arr,int target, int start, int end) {
        if(start>end){
            return -1;
        }
        int mid = (start+end)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid]> target){
            return binarySearch(arr,target,start,mid-1);
        }
        return binarySearch(arr,target,mid+1,end);
    }
}
