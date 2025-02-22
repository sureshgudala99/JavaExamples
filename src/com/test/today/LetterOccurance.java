package com.test.today;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LetterOccurance {

    public static void main(String[] args) {
        String sentence ="Apple Banana";
        Map<String,Long> occmap=Stream.of(sentence.split("\\s")).map(String::toLowerCase).collect(Collectors.groupingBy(word->word,Collectors.counting()));

        occmap.forEach((word1,count1)->System.out.println(word1 +""+count1));



    }
}
