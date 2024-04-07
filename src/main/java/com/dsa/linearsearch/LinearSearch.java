package com.dsa.linearsearch;

public class LinearSearch {

    static int doLinearSearch(int[] arr, int target){
        if(arr.length ==- 0) return -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {56,895,54,2,5,6,8};
        System.out.println(doLinearSearch(arr,5));
    }
}
