package com.dsa.binarysearch;

public class FindCeiling {
    public static void main(String[] args) {
        int[] arr = {4, 6, 8, 9, 12, 18, 22};
        int num=7;
//        System.out.println(findCeilingMethod(arr, num));
        findCeilingMethod(arr,num);
    }

// num 10
    private static void findCeilingMethod(int[] arr, int num) {
        int start = 0;
        int end = arr.length-1;
        if(num<arr[start] || num>arr[end]){
            System.out.println("Invalid number");
            return;
        }
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] == num)
                System.out.println("Ceiling of the number : "+num +" is :"+ arr[mid]);
            if(num>arr[mid])
                start = mid +1;
            else
                end = mid -1;
        }
        System.out.println("Ceiling of the number : "+num +" is :"+ arr[start]);
    }
}

