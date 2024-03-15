package com.practice.pattern;

public class Triangles {
    public static void main(String[] args) {
        int a = 5;
        //right_triangle(a);
        up_down_triangle(a);
    }

    private static void up_down_triangle(int a) {
        System.out.println("print_no_of_rows_asc");
        for (int i = 1; i <= 2 * a; i++) {
            int check = i > a ? 2 * a - i : i;
            int spaces = a - check;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= check; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void right_triangle(int a) {
        System.out.println("print_no_of_rows_asc");
        for (int i = 1; i <= 2 * a; i++) {
            int check = i > a ? 2 * a - i : i;
            for (int j = 1; j <= check; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
