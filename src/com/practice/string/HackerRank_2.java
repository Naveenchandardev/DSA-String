package com.practice.string;

import java.util.Scanner;

public class HackerRank_2 {
    public static void main(String[] args) {
        //task; print the given input value range;
        // first integer is ; should enter how many inputs are user enter;
        //eg: 4 45656 -34343 98 343847398749837; in this input; we mentioned initially , we enter 4 inputs;
        Scanner a = new Scanner(System.in);
        findRange(a);
    }
    private static void findRange(Scanner a) {
        StringBuffer output=new StringBuffer("");long b = 0;
        long  input = a.nextLong();
        for(int i=0; i<input;i++){
            try {
                //	System.out.println(a.nextLong());
                b = a.nextLong();
                output.setLength(0);
                output = new StringBuffer(b+" can be fitted in: \n");
                if(b>=Short.MIN_VALUE && b<= Short.MAX_VALUE){
                    output.append("* short \n");
                }if(b>=Integer.MIN_VALUE && b<= Integer.MAX_VALUE){
                    output.append("* int \n");
                }if(b>=Long.MIN_VALUE && b<= Long.MAX_VALUE){
                    output.append("* long ");
                }
            } catch (Exception e) {
                output.setLength(0);
                output = new StringBuffer(a.nextLine()+" can't be fitted anywhere. ");
            }
            System.out.println(output);
        }
    }
}
