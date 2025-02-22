package com.test.feb;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FreqEachCharecter {

    public static void main(String[] args) {

        String input="helloworld";

        Map<Character,Long > charMap=input.chars().mapToObj(c->(char) c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

         System.out.println();
    }
}
