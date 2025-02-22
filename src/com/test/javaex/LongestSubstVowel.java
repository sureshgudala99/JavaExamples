package com.test.javaex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LongestSubstVowel {

    public static List<String> findConsecutiveVowels(String sentence) {
        List<String> consecutiveVowels = new ArrayList<>();
        Matcher matcher = Pattern.compile("[aeiou]{2,}").matcher(sentence.toLowerCase());
        while (matcher.find()) {
            consecutiveVowels.add(matcher.group());
        }
        return consecutiveVowels;
    }

    public static void main(String[] args) {
        String str = "aahjjkkkkaeioujjjj";

        List<String> listofStrings = findConsecutiveVowels(str);

    }
}