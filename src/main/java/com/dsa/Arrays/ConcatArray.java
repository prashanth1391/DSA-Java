package com.dsa.Arrays;

import java.util.Arrays;

public class ConcatArray {

    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];
        for (int i = 0; i < ans.length; i++) {
            if(i<nums.length)
                ans[i] = nums[i];
            else
                ans[i] = nums[i-nums.length];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,1};
        System.out.println(Arrays.toString(getConcatenation(arr)));
    }
}
