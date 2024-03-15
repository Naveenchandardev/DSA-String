package com.practice.pattern;

public class Number_Patterns {
    public static void main(String[] args)  {
        int a =5;
        pring_no_of_rows_desc(a);
    }
    private static void pring_no_of_rows_desc(int a) {
        System.out.println("up_down_triangle");
        for (int i = 1; i <= a; i++) {
            for (int j = 0; j < a-i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
