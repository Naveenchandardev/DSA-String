package com.practice.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MobileNumberCombo_2 {

    public static void main(String[] args) {
        String  input ="5678";
        List<String> list = letterCombinations(input);
        System.out.println(list);
    }
    public static List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) return Collections.emptyList();

        String[] phone_map = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> output = new ArrayList<>();
        backtrack("", digits, phone_map, output);
        return output;
    }
    public static void backtrack(String combination, String next_digits, String[] phone_map, List<String> output) {
        if (next_digits.isEmpty()) {
            output.add(combination);
        } else {
            String letters = phone_map[next_digits.charAt(0) - '2'];
            for (char letter : letters.toCharArray()) {
                backtrack(combination + letter, next_digits.substring(1), phone_map, output);
            }
        }
    }


}
