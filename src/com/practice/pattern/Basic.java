package com.practice.pattern;

public class Basic {
    public static void main(String[] args) {
        int a = 5;
        basic(a); // print 5 rows & 5 columns
        print_no_of_rows_asc(a);//  row in increasing order
        pring_no_of_rows_desc(a);// row in  descending order
        pring_no_of_rows_desc_2(a); // row in descending order; another way;
    }

    private static void pring_no_of_rows_desc_2(int a) {
        System.out.println("pring_no_of_rows_desc_2");
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pring_no_of_rows_desc(int a) {
        System.out.println("pring_no_of_rows_desc");
        for (int i = 1; i <= a; i++) {
            for (int j = a; i <= j; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    private static void print_no_of_rows_asc(int a) {
        System.out.println("print_no_of_rows_asc");
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
