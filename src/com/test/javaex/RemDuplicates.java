package com.test.javaex;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemDuplicates {

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("Java","Python","Java",".Net","AWS","Azure","Python");

        stringList.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);


    }

}
