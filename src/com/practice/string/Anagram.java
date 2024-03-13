package com.practice.string;

import java.io.*;
import java.util.*;

public class Anagram {

    //HACKER RANK QUESTION;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.next();
        String b =  input.next();
        Map<String, Integer>  output1 = finds(a);
        Map<String, Integer>  output2 = finds(b);
        boolean checks = output(output1, output2);
        boolean checks2 = output(output2, output1);
        if(checks && checks2) System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
    }
    private static boolean output(Map<String, Integer> output1, Map<String, Integer> output2) {
        for(Map.Entry check : output1.entrySet()){
            String col = check.getKey()!=null? check.getKey().toString().toLowerCase():null;
            if(col!=null && !Objects.equals(output2.get(col),output1.get(col))){
                return false;
            }
        }
        return true;
    }
    private static Map<String, Integer>  finds(String b) {
        Map<String, Integer> value = new HashMap<>();
        for(char c : b.toCharArray()){
            String key = String.valueOf(c).toLowerCase();
            if(!value.containsKey(key)){
                value.put(key, 1);
            }
            else{
                value.put(key, value.getOrDefault(key,0)+1);
            }
        }
        return value;
    }
}
