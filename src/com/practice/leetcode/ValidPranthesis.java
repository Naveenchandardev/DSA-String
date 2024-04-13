package com.practice.leetcode;

import java.util.Stack;

public class ValidPranthesis {
    public static void main(String[] args) {
        String s1 = "()[]{}";
        String s2 = "([)]";
        String s3 = "{[]}";
        System.out.println("Is " + s1 + " valid? " + isValid(s1));
        System.out.println("Is " + s2 + " valid? " + isValid(s2));
        System.out.println("Is " + s3 + " valid? " + isValid(s3));
    }
     public static boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();

            for(char c : s.toCharArray()) {
                if(c == '(' || c == '{' || c == '[') {
                    stack.push(c);
                } else {
                    if(stack.isEmpty()) {
                        return false; // If stack is empty but a closing parenthesis is encountered
                    }
                    char top = stack.pop();
                    if((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                        return false; // If closing parenthesis does not match the top of the stack
                    }
                }
            }
            return stack.isEmpty(); // If stack is empty, all parentheses are matched
        }
}
