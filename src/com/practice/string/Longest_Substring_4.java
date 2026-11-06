package com.practice.string;

import java.util.HashSet;
import java.util.Set;

public class Longest_Substring_4 {
    public static void main(String[] args) {
        String input = "chandar";
        longestWithoutRepeating(input);
    }

    private static void longestWithoutRepeating(String s)  {
        Set<Character> set = new HashSet<>();
        int left = 0;
        int maxLength = 0;
        String longestSubstring = "";
        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                longestSubstring = s.substring(left, right + 1);
            }
        }
        System.out.println("Longest substring: " + longestSubstring);
        System.out.println("Length: " + maxLength);
    }
}
