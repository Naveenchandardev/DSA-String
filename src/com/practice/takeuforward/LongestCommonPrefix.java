package com.practice.takeuforward;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
    public static void main(String[] args) {
        String[] words1 = {"flower", "flow", "flight"};
        String[] words2 = {"dog", "racecar", "car"};
        System.out.println("Longest Common Prefix: " + longestCommonPrefix(words1));
        System.out.println("Longest Common Prefix: " + longestCommonPrefixLogic2(words2));
    }

    private static String longestCommonPrefixLogic2(String[] strs) {
        StringBuilder output = new StringBuilder();
        int lenght = Math.min(strs[0].length(), strs[1].length());
        lenght = Math.min(lenght, strs[2].length());
        for(int i=0;i<lenght;i++){
            char a = strs[0].charAt(i);
            char b = strs[1].charAt(i);
            char c = strs[2].charAt(i);
            if(a==b && b==c){
                output.append(strs[0].charAt(i));
            }
        }

        System.out.println(output);
        return output.toString();
    }
}
