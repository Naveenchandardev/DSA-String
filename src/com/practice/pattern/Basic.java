package com.practice.pattern;

public class Basic {
    public static void main(String[] args) {
        int a = 5;
        basic(a); // print 5 rows & 5 columns
        left_top_pattern(a);
        left_bottom_pattern(a);
        right_top_pattern(a);
        right_bottom_pattern(a);
        left_top_pattern_2(a);
    }

    private static void right_bottom_pattern(int a) {
        System.out.println("right_bottom_pattern");
        for (int i = 1; i <= a; i++) {
            for (int k = 1; k <i; k++) {
                System.out.print("  ");
            }
            for (int j = i; j <=a; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    private static void right_top_pattern(int a) {
        System.out.println("right_top_pattern");
        for (int i = 1; i <= a; i++) {
            for (int k = i; k <a; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    private static void left_top_pattern_2(int a) {
        System.out.println("left_top_pattern_2");
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void left_top_pattern(int a) {
        System.out.println("left_top_pattern");
        for (int i = 1; i <= a; i++) {
            for (int j = a; i <= j; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    private static void left_bottom_pattern(int a) {
        System.out.println("left_bottom_pattern");
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void basic(int a) {
        System.out.println("basic");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
