package com.practice.string;

public class ReverseInteger {
    public static void main(String[] args) {
        int a=1856;
        int reversedNumber = reverseInteger(a);
        System.out.println("Reversed integer: " + reversedNumber);
    }
    public static int reverseInteger(int number) {
        int reversedNumber = 0;
        while (number >=1) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return reversedNumber;
    }
}
