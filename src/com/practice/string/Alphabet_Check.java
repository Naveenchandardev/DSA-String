package com.practice.string;

import java.util.HashSet;
import java.util.Set;

public class Alphabet_Check {
    public static void main(String[] args) {
        //CHECK  stringe contains all characters or not;
        String str ="The quick brown fox jumps over the lazy dog";
        boolean result = allAlphabetsPresent(str);
        System.out.println("All alphabets present: " + result);

    }

    private static boolean allAlphabetsPresent(String a) {
        Set<Character> maps= new HashSet<>();
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i)>='a' && a.charAt(i)<='z'){
                maps.add(a.charAt(i));
            }
        }
        if(maps.size()==26)return true;
        return false;
    }
}
