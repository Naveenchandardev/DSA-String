package com.practice.string;

public class ZOHO_CountString {
    public static void main(String[] args) {
        String input = "AAABAACDDEE";
        //output: A3B1A2C1D2E2
        String output = getCountString(input);
        System.out.println(output);
    }

    private static String getCountString(String input) {
        StringBuilder output = new StringBuilder();
        int count = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                output.append(input.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        output.append(input.charAt(input.length() - 1)).append(count);

        return output.toString();
    }
}
