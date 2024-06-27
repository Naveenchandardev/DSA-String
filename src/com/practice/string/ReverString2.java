package com.practice.string;

import java.util.Arrays;

public class ReverString2 {
    public static void main(String[] args) {
        String str = "naveen";
        char [] chars = str.toCharArray();
        int left=0; int right= str.length()-1;
        while(left<right){
            char temp = chars[left];
            chars[left]= chars[right];
            chars[right]= temp;
            left++;right--;
        }
        System.out.println(Arrays.toString(chars));

    }
}
