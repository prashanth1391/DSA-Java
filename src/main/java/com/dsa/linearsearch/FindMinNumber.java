package com.dsa.linearsearch;

public class FindMinNumber {

    public static void main(String[] args) {
        int[] arr = {7,45,8,-5,1,99};
        System.out.println("Minimum number is : "+ findMin(arr));
    }

    public static int findMin(int[] arr) {
        int min =arr[0];
        for(int i : arr){
            if(i<min)
                min =i;
        }
        return min;
    }
}
