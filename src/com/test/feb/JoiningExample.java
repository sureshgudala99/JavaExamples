package com.test.feb;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class JoiningExample {

    public static void main(String[] args) {

        List<String> strList = Arrays.asList("java","python","C#","Java","DB","Oracle");

        strList.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);

       String str= strList.stream().collect(Collectors.joining("," ,"Tech:","Technology"));

       System.out.println("Hello Welcome...");

        System.out.println("Hello Welcome...");
        System.out.println("How are you");
System.out.println(str);


    }
}
