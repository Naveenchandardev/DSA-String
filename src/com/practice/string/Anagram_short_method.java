package com.practice.string;

import java.util.Arrays;

public class Anagram_short_method {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        boolean areAnagrams = areAnagrams(str1, str2);
        if (areAnagrams) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }

    private static boolean areAnagrams(String str1, String str2) {
        str1= str1.toLowerCase();str2=str2.toLowerCase();
        char [] str1Array= str1.toCharArray();
        char [] str2Array= str2.toCharArray();
        Arrays.sort(str1Array);
        Arrays.sort(str2Array);
        return Arrays.equals(str1Array,str2Array);
    }
}
