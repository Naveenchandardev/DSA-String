package com.practice.string;

public class Basics {

	public static void main(String[] args) {
	    String str = "GeeksforGeeks is a computer science portal";
	    //Find character 'G' after 4th character;
	   System.out.println(str.indexOf('G',4)); 
	   
	   //Last index of character 'o';
	   System.out.println(str.lastIndexOf('o'));
	   
	   //First occurence of char 'e' after 7th character
	   System.out.println(str.indexOf('e', 7));
	   
	   //Find 17th character 
	   System.out.println(str.charAt(17));
	   }
}
