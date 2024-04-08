package com.dsa.linearsearch;

public class SearchInString {
    public static void main(String[] args) {
        String name = "prashanth";
        char target = 'p';
        System.out.println(search1(name, target));

    }

    static boolean search(String str, char target) {
        if (str.isEmpty()) return false;
        char[] strInCharArray = str.toCharArray();
        for (char c : strInCharArray) {
            if (c == target)
                return true;
        }
        return false;
    }

    static boolean search1(String str, char target) {
        if (str.isEmpty()) return false;
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i))
                return true;
        }
        return false;
    }
}
