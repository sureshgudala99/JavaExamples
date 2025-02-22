package com.test.dtst;

import java.util.LinkedHashMap;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatableCharecter {

    public static void main(String[] args) {
        String input ="Java Articles are awesome";
     /*   Character c=input.chars().mapToObj(s -> Character.toLowerCase(s)).collect(Collectors.groupingBy(Function.identity(),
                LinkedHashMap::new,Collectors.counting())).entrySet().stream().filter(entry ->entry.getValue() ==1).map(entry ->entry.getKey()).findFirst().get();

                System.out.println(c);*/
    }
}
