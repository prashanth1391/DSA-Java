package com.dsa.binarysearch;

import java.util.Arrays;

public class FindInMountainArray {
    public static void main(String[] args) {
        FindInMountainArray fma = new FindInMountainArray();
        int[] arr = {1,2,3,4,5,3,1};
        int target = 5;
        int peak = fma.findPeak(arr);
//        System.out.println(peak);
        int index1 = fma.findInArray(arr,0,peak,target,true);
        int index2 = fma.findInArray(arr,peak,arr.length-1,target,false);
        System.out.println(fma.finalAnswer(index1,index2));


    }
    public int finalAnswer(int index1, int index2){
        if(index1 ==-1 || index2 == -1){
            return -1;
        }
        else{
            return (index1 < index2)?index1 :index2;
        }
    }

    public int findPeak(int[] arr) {
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
    public int findInArray(int[] arr, int s, int e,int target, boolean isAscending) {
        int start =s;
        int end = e;
        while(start<=end){
           int  mid = start + (end-start)/2;
            if(arr[mid] == target){
//                System.out.println("Element found : " +arr[mid] +" at the position : "+mid);
                return mid;
            }
            if(isAscending){
                if(arr[mid]>target)
                    end = mid -1;
                else
                    start = mid +1;
            }else{
                if(arr[mid]>target)
                    start = mid +1;
                else
                    end = mid -1;
            }

        }
        return -1;

    }
}
