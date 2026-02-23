package com.practice.string;

import java.util.ArrayList;
import java.util.List;

public class Longest_Substring_Without_Repeating_characters {
    public static void main(String[] args) {
        String a ="ASDCSEFDHGYHJYT";String length="";
        String output ="";
        for(char c :a.toCharArray()){
            if(!output.contains(String.valueOf(c))){
                output=	output.concat(String.valueOf(c));
            }
            else{
                int found = output.indexOf(c)+1;
                output = output.substring(found);
                output=	output.concat(String.valueOf(c));
            }
            length = length.length()>output.length()?length:output;
            System.out.println(output);
            System.out.println("longest substring :: "+length);
        }
    }
}
