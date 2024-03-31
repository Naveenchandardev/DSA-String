package com.practice.string;

public class Rotation {
	public static void main(String[] args) {
		String input = "mechanicalEngineering"; // 21 chars
		System.out.println("Left rotation: " + leftrotate(input, 2));
		System.out.println("Right rotation: " + rightrotate(input));
	}

	private static String leftrotate(String str, int d) {
        return str.substring(d) + str.substring(0, d);
	}

	static String rightrotate(String str) {
		return leftrotate(str, str.length() - 2);
	}
}
