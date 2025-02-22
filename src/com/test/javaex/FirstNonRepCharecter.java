package com.test.javaex;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepCharecter {

    public static void main(String[] args) {

        String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();

      Map<String,Long> map=  Arrays.stream(inputString.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));

     String FirstRepElemrt= map.entrySet().stream().filter(entry ->entry.getValue()>1).map(entry -> entry.getKey()).findFirst().get();

System.out.println(FirstRepElemrt);
    }

}
