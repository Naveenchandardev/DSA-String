package com.practice.string;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(5));
        System.out.println(isPrime(25));
    }

    private static boolean isPrime(int n) {
        if(n==0||n==1){
            return  false;
        } else if (n==2) {
            return true;
        }
        else{
            for (int i = 2; i <= Math.sqrt(n) ; i++) {//math.sqrt == square root of value;
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
