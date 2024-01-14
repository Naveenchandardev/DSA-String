package com.practice.string;

public class ReverseString {
	public static void main(String[] args) {
		//METHOD 1: Easy way
		String input ="chandar";
		defaulWay(input);
		//METHOD 2: Reverse method;
	    char[] str = "chandar".toCharArray();
	    System.out.print("METHOD 2 RESULT: ");
	    recursiveReverse(str,0);
	    System.out.println(String.valueOf(str));
	}
	private static void defaulWay(String input) {
	    System.out.print("METHOD 1 RESULT: ");
		char[] chars = input.toCharArray();
		for(int i=chars.length-1; i>=0;i--){
			System.out.print(chars[i]);
		}
		System.out.println();
	}
	static void recursiveReverse(char[] str, int i){
	    int n = str.length;
	    if (i != n / 2) {
		    swap(str,i,n - i - 1);
		    recursiveReverse(str, i + 1);
	    }
	}
	static void swap(char []arr, int i, int j){
	    char temp= arr[i];
	    arr[i]=arr[j];
	    arr[j]=temp;
	} 
}
