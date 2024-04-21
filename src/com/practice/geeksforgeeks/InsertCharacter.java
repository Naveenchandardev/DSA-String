package com.practice.geeksforgeeks;

import java.util.Arrays;

public class InsertCharacter {
    public static void main(String[] args) {
        String str="geeksforgeeks";
        int []a={1,5,7};
        String res = solution(str,a);
        System.out.println(res);
    }

    private static String solution(String str, int[] a) {
        StringBuilder res = new StringBuilder();
        String arraystring = Arrays.toString(a);
        for( int i=0; i<str.length();i++){
            if(arraystring.contains(String.valueOf(i))){
                res.append("*");
            }
            else
                res.append(str.charAt(i));
        }
        return res.toString();
    }
}
