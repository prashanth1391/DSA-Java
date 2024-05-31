package com.dsa.recursion;

public class CountZeros {
    public static void main(String[] args) {
        System.out.println(count(03020));
    }

    private static int count(int number) {
        return helper(number,0);

    }

    private static int helper(int number, int c) {
        if(number ==0 ){
            return c;
        }
        if(number%10 == 0){
            return helper(number/10,c+1);
        }else{
            return helper(number/10,c);
        }
    }
}
