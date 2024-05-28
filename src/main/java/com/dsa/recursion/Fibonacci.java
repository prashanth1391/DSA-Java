package com.dsa.recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibo(4));
    }

    private static int fibo(int i) {
        if(i<2)
            return i;
        return fibo(i-1) + fibo(i-2);
    }
}
