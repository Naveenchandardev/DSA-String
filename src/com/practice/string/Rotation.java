package com.practice.string;

public class Rotation {
	public static void main(String[] args) {
		String input = "mechanicalEngineering"; // 21 chars
		System.out.println("Left rotation: " + leftrotate(input, 2));
		System.out.println("Right rotation: " + rightrotate(input, 2));
	}

	private static String leftrotate(String str, int d) {
		String ans = str.substring(d) + str.substring(0, d);
		return ans;
	}

	static String rightrotate(String str, int d) {
		return leftrotate(str, str.length() - d);
	}
}
