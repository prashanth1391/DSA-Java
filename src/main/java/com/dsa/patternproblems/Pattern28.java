package com.dsa.patternproblems;

public class Pattern28 {
    public static void main(String[] args) {
        pattern5(5);
    }

    private static void pattern5(int num) {
        for(int row=1; row< 2* num;row++){
            int columns = row > num ? 2*num - row :row;
            int spaces = num-columns;
            for(int s=0;s<spaces;s++){
                System.out.print(" ");
            }
            for(int col=1;col<=columns;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
