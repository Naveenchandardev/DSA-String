package com.practice.string;

public class RotateString {
    public static void main(String[] args) {
        String str1="abcde";
        String str2 = "cdeab";
        boolean result = checkCondition(str1, str2);
        System.out.println("Result is : "+result);
    }

    private static boolean checkCondition(String str1, String str2) {
        String concat= str1+str1;
        return concat.contains(str2);
    }
}
