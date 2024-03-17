package com.practice.string;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    public static void main(String[] args) {
        //print how many times characters found;
        String str = "Naveenchandar";
        Map<Character, Integer> charCount = countCharacters(str);
        System.out.println("Character count:");
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<Character, Integer> countCharacters(String str) {
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }
        }
        return charCount;
    }

}
