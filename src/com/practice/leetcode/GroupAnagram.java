package com.practice.leetcode;

import java.util.*;

public class GroupAnagram {
    public static void main(String[] args) {
        String[]input = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> result = solution(input);
        System.out.println(result);
    }

    private static List<List<String>> solution(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);
            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }
            map.get(sortedWord).add(word);
        }
        return new ArrayList<>(map.values());
    }
}
