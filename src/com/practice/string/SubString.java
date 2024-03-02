package com.practice.string;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubString {
	public static void main(String[] args) {
		String input = "Hello World!";
		Set<Character> uniqueChars = new HashSet<>();

		// Iterate through each character in the input string
		for (char x : input.toCharArray()) {
			// Add the character to the set if it's not already present
			if (!Character.isWhitespace(x)) {
				uniqueChars.add(Character.toLowerCase(x));
			}
		}

		// Print the unique characters
		System.out.println("Unique Characters:");
		for (char c : uniqueChars) {
			System.out.print(c + " ");
		}
		System.out.println();
		System.out.println("Count: " + uniqueChars.size());
	}

}
