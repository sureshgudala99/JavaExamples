package com.test.dtst;

import java.security.Key;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateIntegers {
    public static void main(String[] args) {
        Integer[] arr = {2, 3, 4, 5, 2, 6, 7, 5, 7,7,7,3};

        //Arrays.stream(arr).distinct().forEach(System.out::println);
        List<Integer> list = Arrays.asList(arr);

        Map<Integer,Long> duplicates =list.stream().collect(Collectors.groupingBy(e ->e,Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() >1).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));

        duplicates.forEach((key,value)-> System.out.println("key is "+ key + "Value is" +value));


    }
    }