package com.dsa.recursion;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverseNumber(1234));
    }

    //method 1
    private static int reverseNumber(int num) {
        int digit = (int) (Math.log10(num)+1);
        return helper(num,digit);
    }

    private static int helper(int num, int digit) {
        if(num/10==0){
            return num;
        }
        return (num%10)*(int)Math.pow(10,digit-1) + helper(num/10,digit-1);
    }
}
