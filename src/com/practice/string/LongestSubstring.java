package com.practice.string;

import java.util.HashSet;

public class LongestSubstring {
    public static void main(String[] args) {

        String str = "abcabcbb";

        HashSet<Character> set = new HashSet<>();

        String current = "";
        String longest = "";

        for (char ch : str.toCharArray()) {

            if (set.contains(ch)) {
                set.clear();
                current = "";
            }

            set.add(ch);
            current += ch;

            if (current.length() > longest.length()) {
                longest = current;
            }
        }

        System.out.println(longest);
    }
}
