package com.practice.string;

import java.util.Scanner;

public class HackerRank {
    public static void main(String[] args) {
        //TASK;  final ouput should be 3 digits;
        // when we enter integer less than 3 char; it fill the empty space with 0
        //sample input chandar 5 naveen 987 thiru 23
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf( "%-10s%03d %n", s1, x);
            //printf has a format specifiers; s handle string d handle integer and n about new line;
        }

    }
}
