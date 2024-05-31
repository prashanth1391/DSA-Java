package com.dsa.recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(123));
    }

    private static int sumOfDigits(int number) {
        if(number/10 ==0){
            return number;
        }
        return number%10 + sumOfDigits(number/10);
    }
}
