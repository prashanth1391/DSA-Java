package com.dsa.binarysearch;

public class NextGreatestLetter {
    public static void main(String[] args) {
        char[] letters = {'e','e','e','e','e','n','n','n','n'};
        char target = 'e';
        System.out.println(findNextGreatestLetter(letters,target));
    }

    private static char findNextGreatestLetter(char[] arr, char target) {
        int start = 0;
        int end = arr.length-1;
        if(target > arr[end] || target == arr[end] || target<arr[start]) {
            return arr[start];
        }
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] > target)
                end = mid -1;
            else
                start = mid +1;
        }
        return arr[start];
    }
}
