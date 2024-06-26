package com.practice.pattern;

public class Triangles {
    public static void main(String[] args) {
        int a = 5;
        right_triangle(a);
    }

    private static void right_triangle(int a) {
        System.out.println("right_triangle");
        for (int i = 1; i <= 2 * a; i++) {
            int check = i > a ? 2 * a - i : i;
            for (int j = 1; j <= check; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
