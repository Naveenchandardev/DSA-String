package com.practice.string;

import java.util.ArrayList;
import java.util.List;

public class Split_Integer_String {
    public static void main(String[] args) {
        String a="XYZ123";
        List<Character> character = new ArrayList<>();
        List<Character> integers = new ArrayList<>();
        for(char ch: a.toCharArray()){
            if(Character.isDigit(ch)){
                integers.add(ch);
            }
            else{
                character.add(ch);
            }
        }
        System.out.println("Integers: "+ integers);
        System.out.println("Characters: "+character);

    }
}
