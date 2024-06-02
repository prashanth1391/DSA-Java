package com.dsa.patternproblems;

public class Pattern5 {
    public static void main(String[] args) {
        pattern5(5);
    }

    private static void pattern5(int num) {
        for(int row=1; row< 2* num;row++){
            int columns = row > num ? 2*num - row :row;
            for(int col=1;col<=columns;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
