package com.practice.string;

public class UpperCase {
    public static void main(String[] args) {
        //change every word's first letter into uppercase;
        String str="I got intern at geeksforgeeks";
        StringBuilder res= new StringBuilder();
        for(String a: str.split(" ")){
            String b= a.substring(0,1).toUpperCase()+a.substring(1);
            res.append(b).append(" ");
        }
        System.out.println(res);
    }
}
