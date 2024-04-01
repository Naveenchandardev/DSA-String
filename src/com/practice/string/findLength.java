package com.practice.string;

public class findLength {
    public static void main(String[] args) {
        String input ="Hello world ";
        String[] inputArray =input.split(" ");
        String getvalue = inputArray[inputArray.length-1];
        System.out.println(getvalue.length());
    }
}
