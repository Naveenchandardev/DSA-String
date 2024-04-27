package com.practice.leetcode;

public class RemoveStars {
    public static void main(String[] args) {
    //    Remove the closest non-star character to its left, as well as remove the star itself.
        String a ="leet**cod*e";
        String result = checkCondition(a);
        System.out.println(result);
    }
    private static String checkCondition(String a) {
        StringBuffer result = new StringBuffer();
        for(int i=0;i<a.length();i++){
            if(!String.valueOf(a.charAt(i)).equals("*")){
                result.append(a.charAt(i));
            }
            else{
                result.deleteCharAt(result.length()-1);
            }
        }
        return result.toString();
    }
}
