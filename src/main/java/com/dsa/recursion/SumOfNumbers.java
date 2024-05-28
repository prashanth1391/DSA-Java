package com.dsa.recursion;

public class SumOfNumbers {
        public static void main(String[] args) {
            System.out.println(sumOfNumbers(5));
        }

        private static int sumOfNumbers(int i) {
            if(i<=1){
                return 1;
            }
            return i + sumOfNumbers(i-1);
        }
    }

