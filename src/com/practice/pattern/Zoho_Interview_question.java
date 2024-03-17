package com.practice.pattern;

public class Zoho_Interview_question {
    public static void main(String[] args) {
        int a =5;
        print_pattern(a);
/*          OUTPUT:
                1
              2 3 2
            3 4 5 4 3
          4 5 6 7 6 5 4
        5 6 7 8 9 8 7 6 5
*/

    }

    private static void print_pattern(int a) {
        int z =0;
        for (int i = 1; i <= a; i++) {
            for (int j = 0; j < a-i; j++) {
                	System.out.print("  ");
            }
            int c = i + i;
            for (int j = i; j < i+i; j++) {
                System.out.print(j+" ");
            }
            for (int j = c - 2; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
