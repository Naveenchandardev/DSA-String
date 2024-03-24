package com.practice.string;

public class ReverseInteger {
    public static void main(String[] args) {
        int a=54564654;
        int reversedNumber = reverseInteger(a);
        System.out.println("Reversed integer: " + reversedNumber);
    }
    public static int reverseInteger(int number) {
        int reversedNumber = 0;
        while (number >1) {
            int digit = number % 10; // Extract the last digit
            reversedNumber = reversedNumber * 10 + digit; // Append the digit to the reversed number
            number /= 10; // Move to the next digit by dividing the number by 10
        }
        return reversedNumber;
    }
}
