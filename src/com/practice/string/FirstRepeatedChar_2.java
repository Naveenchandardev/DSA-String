package com.practice.string;

public class FirstRepeatedChar_2 {
    public static void main(String[] args) {
        String str = "naveenchandar";
        boolean[] seen = new boolean[256];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (seen[ch]) {
                System.out.println("First repeated character: " + ch);
                return;
            }
            seen[ch] = true;
        }
        System.out.println("No repeated character");
    }
}
