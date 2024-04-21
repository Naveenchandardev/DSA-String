package com.practice.string;

public class LongestSubstring_3 {
    public static void main(String[] args) {
        String s = "aaaaaba";
        String longestSubstring = "";
        for (int i = 0; i < s.length(); i++) {
            String currentSubstring = "";
            for (int j = i; j < s.length(); j++) {
                if (currentSubstring.contains(String.valueOf(s.charAt(j)))) {
                    break;
                }
                currentSubstring += s.charAt(j);
            }
            if (currentSubstring.length() > longestSubstring.length()) {
                longestSubstring = currentSubstring;
            }
        }
        System.out.println( longestSubstring);
    }
}
