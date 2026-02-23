package com.practice.string;

import java.util.HashMap;
import java.util.Map;

public class Longest_Substring_Without_Repeating_characters_2 {
    public static void main(String[] args) {
        String input = "chandar";
        int result = lengthOfLongestSubstring(input);
        System.out.println("Length of the longest substring without repeating characters: " + result);
    }
    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty())
            return 0;
        int maxLength = 0;
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (map.containsKey(c)) {
                left = Math.max(left, map.get(c) + 1);
            }
            map.put(c, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
