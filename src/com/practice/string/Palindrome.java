package com.practice.string;

  public class Palindrome {

	public static void main(String[] args) {
		String input = "mom";
		StringBuilder res = new StringBuilder();
		Boolean result= false;
		for(int i=input.length()-1; i>=0;i--) {
			res.append(input.charAt(i));
		}
		if(res.toString().equals(input))result= true;
		System.out.println(result);
 	}
}
