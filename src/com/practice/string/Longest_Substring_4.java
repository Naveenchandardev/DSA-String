package com.practice.string;

import java.util.HashSet;
import java.util.Set;

public class Longest_Substring_4 {
    public static void main(String[] args) {
        String input = "";
        String output = longestWithoutRepeating(input);
        System.out.println(output);
    }

    private static String longestWithoutRepeating(String str)  {
        Set<Character> set = new HashSet<>();
        int left = 0;
        String longest = "";
        for (int right = 0; right < str.length(); right++) {
            char ch = str.charAt(right);
            while (set.contains(ch)) {
                set.remove(str.charAt(left));
                left++;
            }
            set.add(ch);
            String current = str.substring(left, right + 1);
            if (current.length() > longest.length()) {
                longest = current;
            }
        }
        return longest;
    }
}
