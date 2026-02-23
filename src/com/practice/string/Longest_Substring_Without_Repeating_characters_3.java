package com.practice.string;

public class Longest_Substring_Without_Repeating_characters_3 {
    public static void main(String[] args) {
        String s = "aaaaaba";
        String longestSubstring = "";
        for (int i = 0; i < s.length(); i++) {
            StringBuilder currentSubstring = new StringBuilder();
            for (int j = i; j < s.length(); j++) {
                if (currentSubstring.toString().contains(String.valueOf(s.charAt(j)))) {
                    break;
                }
                currentSubstring.append(s.charAt(j));
            }
            if (currentSubstring.length() > longestSubstring.length()) {
                longestSubstring = currentSubstring.toString();
            }
        }
        System.out.println( longestSubstring);
    }
}
