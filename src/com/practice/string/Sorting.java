package com.practice.string;

import java.util.Arrays;

public class Sorting {
	static final int MAX_CHAR = 26;

	public static void main(String[] args) {
		// METHOD 1: NORMAL METHOD: it accepts both special characters and capital
		// letters;
		String input = "mechanical.Engineering";
		char chars[] = input.toCharArray();
		Arrays.sort(chars);
		System.out.println(chars);
		// METHOD 2: USING ASCII METHOD; its only accepts alphabetic words; not accepted
		// special character and capital letters
		asciiMethod("mechanicalengineering");
	}

	static void asciiMethod(String input) {
		// Hash array to keep count of characters.
		int letters[] = new int[MAX_CHAR];
		for (char x : input.toCharArray()) {
			letters[x - 'a']++;
		}
		// Traverse the hash array and print
		// characters
		for (int i = 0; i < MAX_CHAR; i++) {
			for (int j = 0; j < letters[i]; j++) {
				// System.out.println("check "+ (i + 'a'));
				System.out.print((char) (i + 'a'));
			}
		}
	}
}
