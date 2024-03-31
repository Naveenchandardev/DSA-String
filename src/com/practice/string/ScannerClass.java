package com.practice.string;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        System.out.println("Enter integer:");
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        System.out.println("Enter double:");
        double d = scan.nextDouble();
        System.out.println("Enter string:");
        String  s = scan.next();
        scan.close();
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
