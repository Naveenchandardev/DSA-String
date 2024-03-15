package com.practice.pattern;

public class Triangles {
    public static void main(String[] args) {
        int a =5;
        pring_no_of_rows_desc(a);
    }

    private static void pring_no_of_rows_desc(int a) {
        System.out.println("print_no_of_rows_asc");
        for(int i=1;i<=2*a;i++){
            int check = i>a? 2*a -i:i;
            for(int j=1;j<=check;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
