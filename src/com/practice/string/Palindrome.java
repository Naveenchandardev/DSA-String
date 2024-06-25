package com.practice.string;

public class Palindrome {
    public static void main(String[] args) {
        String testStr1 = "racecar";
        String testStr2 = "hello";
        System.out.println(testStr1 + " is a palindrome?: " + isPalindrome(testStr1)); // true
        System.out.println(testStr2 + " is a palindrome?: " + isPalindrome(testStr2)); // false
    }
    public static boolean isPalindrome(String str) {
            int n = str.length();
            for (int i = 0; i < n / 2; i++) {
                if (str.charAt(i) != str.charAt(n - 1 - i)) {
                    return false;
                }
            }
            return true;
        }
}
