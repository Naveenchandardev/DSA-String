package com.practice.string;

public class BinaryDigit {
    public static void main(String[] args) {
        int num1 = 101010; // Binary number
        int num2 = 12345; // Non-binary number

        System.out.println(num1 + " is binary? " + isBinary(num1));
        System.out.println(num2 + " is binary? " + isBinary(num2));
    }

    private static boolean isBinary(int num) {
        while(num!=0){
            int digit = num%10;
            if(digit!=0 && digit!=1)
                return false;
            num/=10;
        }return true;

    }
}
