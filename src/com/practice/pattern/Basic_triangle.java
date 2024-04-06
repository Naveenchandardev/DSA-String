package com.practice.pattern;

public class Basic_triangle {
    public static void main(String[] args) {
        int a = 5;
        finds(a);
    }

    private static void finds(int a) {
        for (int i = 1; i <= a; i++) {
            for (int j = a; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
