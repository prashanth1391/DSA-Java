package com.dsa.recursion;

public class StepsToMakeZero {
    public static void main(String[] args) {
        System.out.println(stepsToZero(2435));
    }

    private static int stepsToZero(int number) {
        return helper(number,0);
    }

    private static int helper(int number, int steps) {
        if(number/10 == 0){
            return steps;
        }
        if(number%2 == 0 ){
            return helper(number/2,steps+1);
        }else {
            return helper(number-1,steps+1);
        }
    }
}
