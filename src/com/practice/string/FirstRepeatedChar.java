package com.practice.string;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatedChar {
    public static void main(String[] args) {
        String str = "naveenchandar";
        Set<Character> set = new HashSet<>();
        for (char ch : str.toCharArray()) {
            if (set.contains(ch)) {
                System.out.println(ch);
                break;
            }
            set.add(ch);
        }
    }
}
