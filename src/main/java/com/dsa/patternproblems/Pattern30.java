package com.dsa.patternproblems;

public class Pattern30 {
    public static void main(String[] args) {
        pattern30(5);
    }

    private static void pattern30(int num) {
        for(int row = 1; row<=num; row++){
            int spaces = num-row;
            for(int s =0 ; s<spaces;s++){
                System.out.print("  ");
            }
            for(int col =row;col >=1;col--){
                System.out.print(col+" ");
            }
            for(int col = 2; col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
