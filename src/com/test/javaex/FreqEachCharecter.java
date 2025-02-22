package com.test.javaex;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FreqEachCharecter {

    public static void main(String[] args) {
        String in="I Love India";
        List<String> thingsList = Arrays.asList("Pen","Book","Pencil","Pen","Book","Pen","chair");
  /*    Map<Character,Long> map= in.chars().mapToObj(c ->(char) c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
System.out.println(map);*/

        Map<String,Long> countMap=thingsList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

   System.out.println(countMap);
    }





}
