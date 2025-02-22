package com.test.javaex;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatedElement {

    public static void main(String[] args) {

        List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");

        Map<String,Long> repMap=listOfStrings.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

      Map.Entry<String,Long> mostRepElement =  repMap.entrySet().stream().max(Map.Entry.comparingByValue()).get();


        System.out.println("Most Frequent Element : "+mostRepElement.getKey());

    }

}
