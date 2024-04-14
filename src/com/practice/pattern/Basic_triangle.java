package com.practice.pattern;

public class Basic_triangle {
    public static void main(String[] args) {
        int a = 5;
        logic1(a);
        logic2(a);
    }

    private static void logic2(int a) {
        System.out.println("logic 2 : Mirror pattern; ");
        for (int i = 1; i <= a; i++) {
            for (int j = i; j <= a; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void logic1(int a) {
        System.out.println("logic 1");
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
