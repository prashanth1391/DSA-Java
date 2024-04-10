package com.dsa.binarysearch;

public class FindPeakNumberInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,2,1};
        System.out.println(findPeak(arr));
    }

    private static int findPeak(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        int ans = 0;
        while(start<=end){
            int mid = start + (end-start)/2;
            if((arr[mid] > arr[mid+1]) && arr[mid] > arr[mid-1]){
                ans = mid;
                break;
            }
            if(arr[mid]<arr[mid+1]) start = mid +1;
            else end = mid-1;
        }
        return ans;
    }
}
