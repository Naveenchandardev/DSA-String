package com.practice.geeksforgeeks;

import java.util.HashMap;
import java.util.Map;

public class PhoneNumber {
    public static void main(String[] args) {
        // Convert a sentence into its equivalent mobile numeric keypad sequence
        String str = "GEEKSFORGEEKS";
        str = str.toLowerCase();
        Map<Integer, String> letters = new HashMap<>();
        letters.put(2, "abc");
        letters.put(3, "def");
        letters.put(4, "ghi");
        letters.put(5, "jkl");
        letters.put(6, "mno");
        letters.put(7, "pqrs");
        letters.put(8, "tuv");
        letters.put(9, "wxyz");
        StringBuilder value2 = new StringBuilder();
        char ch[] = str.toCharArray();
        StringBuilder strBuil = new StringBuilder();
        for (char con1 : ch) {
            for (Map.Entry con2 : letters.entrySet()) {
                System.out.println(con2.getValue());
                System.out.println(con1);
                if (con2.getValue().toString().contains(String.valueOf(con1))) {
                    int charPos = con2.getValue().toString().indexOf(con1) + 1;
                    strBuil = calculateString(charPos, con2.getKey().toString(), value2);
                    break;
                }
            }
        }
        System.out.println(strBuil);
    }

    private static StringBuilder calculateString(int charPos, String con1, StringBuilder value2) {
        for (int i = 0; i < charPos; i++) {
            value2.append(con1);
        }
        return value2;
    }
}
