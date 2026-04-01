package com.practice.leetcode;

import java.util.*;

public class Group_Anagram_2 {
    public static void main(String[] args) {
        String[] input = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(input));

    }
    public static List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {

            int[] count = new int[26];

            for (char c : word.toCharArray()) {
                count[c - 'a']++;
            }

            String key = Arrays.toString(count);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(word);
        }

        return new ArrayList<>(map.values());
    }
}
