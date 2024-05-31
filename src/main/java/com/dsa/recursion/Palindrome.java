package com.dsa.recursion;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome(123));
    }

    private static boolean palindrome(int number) {
        return number == reverseNumber(number);
    }

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
