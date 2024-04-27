package com.practice.string;

import java.util.logging.Logger;

public class ConsecutiveSubstring {
    static Logger logger = Logger.getLogger(ConsecutiveSubstring.class.getName());

    public static void main(String[] args) {
        String str = "chandar";
        findConsecutiveSubstrings(str);
    }
    public static void findConsecutiveSubstrings(String str) {
        int n = str.length();
        for (int len = 1; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                String res = str.substring(i, i + len);
                System.out.println(res);
            }
        }
    }
}
