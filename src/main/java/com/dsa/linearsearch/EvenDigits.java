package com.dsa.linearsearch;

import java.util.ArrayList;
import java.util.List;

public class EvenDigits {
    public static void main(String[] args) {
        int[] arr = {12, 2, 789, 6985, 78459};
        List<Integer> ans = findEvenDigits(arr);
        for (int i : ans) {
            System.out.println(i);
        }
    }

    private static List<Integer> findEvenDigits(int[] arr) {
        List<Integer> ansArray = new ArrayList<>();
        for (int arrElement : arr) {
            if (Integer.toString(arrElement).length() % 2 == 0)
                ansArray.add(arrElement);
        }
        return ansArray;
    }
}
