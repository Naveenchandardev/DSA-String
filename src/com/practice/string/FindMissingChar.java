package com.practice.string;

public class FindMissingChar {
    public static void main(String[] args) {
        //find which b's char not present in a;
        String a="abcd";
        String b ="za";
        char ch= checkCondition(a,b);
        System.out.println(ch);
    }

    private static char checkCondition(String a, String b) {
        for(char c: b.toCharArray()){
            if(!a.contains(String.valueOf(c)))
                return c;
        }
        return 0;
    }
}
