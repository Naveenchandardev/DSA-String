package com.practice.string;

public class Palindrome2 {
    public static void main(String[] args)    {
        String str = "radar";
        String tempText = alterText(str);
        System.out.println(str.equals(tempText));
    }

    public static String alterText(String inputText) {
        if (inputText == null || inputText.isEmpty()) {
            return inputText;
        }
        String c =inputText.substring(0, inputText.length() - 1);
        String d = alterText(c);
        String b = inputText.charAt(inputText.length() - 1) + d;
        System.out.println(b);
        return b;
    }
}
