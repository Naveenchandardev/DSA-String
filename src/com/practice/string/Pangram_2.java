package com.practice.string;

public class Pangram_2 {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lzy dog";
        boolean isPangram = isPangram(sentence.toLowerCase());
        if (isPangram) {
            System.out.println("The sentence is a pangram.");
        } else {
            System.out.println("The sentence is not a pangram.");
        }
    }
    public static boolean isPangram(String sentence) {
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (sentence.indexOf(ch) == -1) {
                return false; // If any letter is not found, it's not a pangram
            }
        }
        return true; // All letters are found, it's a pangram
    }
}
