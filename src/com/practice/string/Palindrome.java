package com.practice.string;

  public class Palindrome {

	public static void main(String[] args) {
		String input = "mom";
		String res ="";
		Boolean result= false;
		for(int i=input.length()-1; i>=0;i--) {
			res = res +input.charAt(i);
		}
		if(res.equals(input))
			result= true;
			System.out.println(result);
 	}

}
