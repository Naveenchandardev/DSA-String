package com.practice.pattern;

public class ButterflyPattern {
    public static void main(String[] args) {
        int a =10;
        for (int i = 1; i < a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int k = i; k <a; k++) {
                System.out.print("    ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println( );
        }
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a - i + 1; j++) {
                System.out.print("* ");
            }
            for (int k = 1; k <i; k++) {
                System.out.print("    ");
            }
            for (int j = i; j <=a; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
