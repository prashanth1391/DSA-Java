package com.dsa.recursion;

public class ProductOfDigits {
    public static void main(String[] args) {
        System.out.println(productOfDigits(12));
    }

    private static int productOfDigits(int number) {
        if(number/10 ==0){
            return number;
        }
        return number%10 * productOfDigits(number/10);
    }
}
