package com.test.feb;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    public static void main(String[] args) {

       List<String> strList = Arrays.asList("java","python","C#","Java","DB","Oracle");
   strList.stream().distinct().collect(Collectors.toList()).forEach(System.out::print);







    }
}
