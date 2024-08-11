package com.practice.geeksforgeeks;

import java.util.Stack;

public class Reverse_String_BY_Stack {
    //https://www.geeksforgeeks.org/java-program-to-reverse-a-string-using-stack/
    public static void main(String[] args) {
       String input ="Naveenchandar";
       String result = solution(input);
        System.out.println(result);
    }

    private static String solution(String input) {
        Stack st = new Stack<>();
        StringBuffer res= new StringBuffer();
        int i=0;
        for(Character ch: input.toCharArray()){
            st.push(ch);
        }
        while(!st.isEmpty()){
            res.append(st.pop());
        }
        return  res.toString();
    }
}
