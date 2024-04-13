package com.practice.string;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String a="zsdczxs";
        System.out.println(findss(a));
    }

    private static Character findss(String a) {
        for(char c: a.toCharArray()){
            if (a.indexOf(c) == a.lastIndexOf(c))
                return c;
        }
        return null;
    }
}
