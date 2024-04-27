package com.practice.leetcode;

import java.util.Objects;

public class ReverseString {
    public static void main(String[] args) {
        String a="a good  example";
        StringBuilder result = new StringBuilder();
        String [] StringArray = a.split(" ");
        int length = StringArray.length;
        for(int i=length-1;i>=0;i--){
            if(!Objects.equals(StringArray[i],""))
                result.append(StringArray[i]+ " ");
        }
        System.out.println(result.toString().trim());
    }
}
