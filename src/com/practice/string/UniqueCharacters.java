package com.practice.string;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueCharacters {
	public static void main(String[] args) {
		String input = "Hello World!";
		Set<Character> uniqueChars = new HashSet<>();
		for (char x : input.toCharArray()) {
			if (!Character.isWhitespace(x)) {
				uniqueChars.add(Character.toLowerCase(x));
			}
		}
		System.out.println("Unique Characters:");
		for (char c : uniqueChars) {
			System.out.print(c + " ");
		}
		System.out.println();
		System.out.println("Count: " + uniqueChars.size());
	}

}
