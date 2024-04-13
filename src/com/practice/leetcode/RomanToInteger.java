package com.practice.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
         String roman = "MMXXIV";
        int integer =  romanToInt(roman);
        System.out.println("Integer value of Roman numeral " + roman + " is: " + integer);
    }
    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int result = 0;
        int prevValue = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int currValue = map.get(s.charAt(i));
            if (currValue >= prevValue) {
                result += currValue;
            } else {
                result -= currValue;
            }
            prevValue = currValue;
        }
        return result;
    }
}
