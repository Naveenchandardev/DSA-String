package com.practice.string;
import java.io.*;
import java.util.*;
public class Large_Small_Substrings {
    //hacker rank question:
    // inputs; word and integer; integer represents substring length;
    // from collection of sorted substrings find low and highest substring;
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        List<String> substrings = getAllSubstrings(a.next(), a.nextInt());
        String[] array = substrings.toArray(new String[0]);
        Arrays.sort(array);
        System.out.println(array[0]);
        System.out.println(array[array.length-1]);
    }
    public static List<String> getAllSubstrings(String input,int loop) {
        List<String> substrings = new ArrayList<>();
        for (int i = 0; i <= input.length() - loop; i++) {
            String substring = input.substring(i, i + loop);
            substrings.add(substring);
        }
        return substrings;
    }    }

