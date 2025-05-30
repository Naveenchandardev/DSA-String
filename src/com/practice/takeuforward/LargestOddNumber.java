package com.practice.takeuforward;

public class LargestOddNumber {
    public static String largestOddNumber(String num) {
        // Start from the end and move backwards
        for (int i = num.length() - 1; i >= 0; i--) {
            char ch = num.charAt(i);
            if ((ch - '0') % 2 == 1) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }
    public static void main(String[] args) {
        String input1 = "35427";
        String input2 = "4306";

        System.out.println("Largest odd number in " + input1 + ": " + largestOddNumber(input1));
        System.out.println("Largest odd number in " + input2 + ": " + largestOddNumber(input2));
    }
}
