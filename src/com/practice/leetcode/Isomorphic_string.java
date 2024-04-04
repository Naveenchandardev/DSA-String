package com.practice.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Isomorphic_string {
    public static void main(String[] args) {
        String s1="abbc";String b="xffz";
        System.out.println("result is :: "+findres(s1).equals(findres(b)));
    }
    private static String  findres(String s1) {
        Map<Character,Integer> maps = new HashMap<>();int count =0;StringBuffer s3 = new StringBuffer();
        for(char ch : s1.toCharArray()){
            if (!maps.containsKey(ch)){
                count++;
                maps.put(ch, count);
                s3 =s3.append(count);
            }
            else {
                int val = maps.get(ch);
                s3=s3.append(val);
            }
        }
        return s3.toString();
    }
}
