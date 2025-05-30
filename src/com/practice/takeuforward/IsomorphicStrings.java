package com.practice.takeuforward;

import java.util.HashMap;

public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char chS = s.charAt(i);
            char chT = t.charAt(i);
            if (mapST.containsKey(chS)) {
                if (mapST.get(chS) != chT) return false;
            } else {
                if (mapTS.containsKey(chT)) return false;
                mapST.put(chS, chT);
                mapTS.put(chT, chS);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "egg", t1 = "add";
        String s2 = "foo", t2 = "bar";

        System.out.println("Is Isomorphic: " + isIsomorphic(s1, t1)); // true
        System.out.println("Is Isomorphic: " + isIsomorphic(s2, t2)); // false
    }
}
