package com.practice.string;

import java.util.HashSet;
import java.util.Set;

public class Pangram {
    public static void main(String[] args)  {
        String sentence = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = isPangram(sentence.toLowerCase());
        if (isPangram) {
            System.out.println("The sentence is a pangram.");
        } else {
            System.out.println("The sentence is not a pangram.");
        }
    }
    public static boolean isPangram(String sentence) {
        Set<Character> letters = new HashSet<>();
        for (char ch : sentence.toCharArray()) {
            if (Character.isLetter(ch)) {
                letters.add(ch);
            }
        }
        return letters.size() == 26; // If there are 26 distinct letters, it's a pangram
    }
}
