package com.practice.string;

public class Longest_Substring_5 {
    public static void main(String[] args) {
        String a = "ASDCSEFDHGYHJYT", output = "", length = "";
        for (char c : a.toCharArray()) {
            if (output.contains(String.valueOf(c)))
                output = output.substring(output.indexOf(c) + 1);

            output += c;
            length = length.length() > output.length() ? length : output;
        }
        System.out.println("Longest substring: " + length);
    }
}
