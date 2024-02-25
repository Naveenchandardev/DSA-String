package com.practice.string;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        System.out.println("Enter integer:");
        Scanner obj = new Scanner(System.in);
        int i = obj.nextInt();
        System.out.println("you entered : "+i);
        //obj.nextLine();

        System.out.println("Enter double:");
        double doub = obj.nextDouble();
        System.out.println("you entered : "+doub);
        obj.nextLine(); // if you have next input is string; use nextline()
        System.out.println("Enter String:");
        String str = obj.nextLine();
        System.out.println("you entered : "+str);
        obj.close();


    }
}
