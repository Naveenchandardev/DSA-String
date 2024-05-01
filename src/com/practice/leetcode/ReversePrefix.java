package com.practice.leetcode;

public class ReversePrefix {
    public static void main(String[] args) {
        String a="abcdefd";char ch='z';
        String result = checkCondition(a,ch);
        System.out.println(result);
    }
    private static String checkCondition(String a, char ch) {
        int pos = a.indexOf(ch);StringBuilder result = new StringBuilder();
        for(int i=pos; i>=0;i--){
            result.append(a.charAt(i));
        }
        result.append(a.substring(pos+1, a.length()));
        if(result.equals(null))result= new StringBuilder(a);
        return result.toString();
    }
}
