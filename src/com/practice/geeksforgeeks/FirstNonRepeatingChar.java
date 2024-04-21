package com.practice.geeksforgeeks;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        //FIND first non repeating char;
        String a="zsdczxs";
        System.out.println(solution(a));
    }

    private static Character solution(String a) {
        for(char c: a.toCharArray()){
            if (a.indexOf(c) == a.lastIndexOf(c))
                return c;
        }
        return null;
    }
}
