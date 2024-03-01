package com.practice.string;
import java.util.ArrayList;
import java.util.List;
public class SubString {
	public static void main(String[] args) {
		String inputString ="chandde"; //count only unique characters
		int start =0; int end =0; int max =0;
		List<Character> result = new ArrayList<Character>();
		while(end<inputString.length()) {
			if(!result.contains(inputString.charAt(end))) {
				result.add(inputString.charAt(end));
				end++;
				max = Math.max(max, result.size());
			}
			else {
				result.remove(Character.valueOf(inputString.charAt(start)));
				start++;
 			}
		}
		System.out.println(max);
	}

}
