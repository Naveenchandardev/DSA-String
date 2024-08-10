package com.practice.leetcode;

import java.util.HashMap;
import java.util.Map;

public class SecondMax_Repeating_Character {
    public static void main(String[] args) {
        String a="naveenchandar";
        int value = Integer.MIN_VALUE;
        int secondValue = Integer.MIN_VALUE;
        Character chresult = null;
        Map<Character, Integer> map= new HashMap<>();
        for(Character ch: a.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        System.out.println(map);
        for(Map.Entry maps: map.entrySet()){
            value= Integer.max(value, Integer.parseInt(maps.getValue().toString()));
        }
        for(Map.Entry maps: map.entrySet()){
            if(Integer.parseInt(maps.getValue().toString())!=value){
                if(Integer.parseInt(maps.getValue().toString())>secondValue){
                    secondValue= Integer.parseInt(maps.getValue().toString());
                    chresult= (Character) maps.getKey();
                }
            }
        }
        System.out.println(secondValue);
        System.out.println("Character is : "+chresult);
    }
}
