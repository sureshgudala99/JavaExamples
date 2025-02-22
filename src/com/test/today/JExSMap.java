package com.test.today;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class JExSMap {

    public static void main(String[] args) {

        List<String> fruitsList = Arrays.asList("apple","banana","orange");

        String upperlist =fruitsList.stream().peek(s->System.out.println(s)).
                map(String::toUpperCase).collect(Collectors.joining(","));

      Optional<String> fruit = fruitsList.stream().filter(s->s.startsWith("b")).findFirst();
        Optional<String> fruit1 = fruitsList.stream().filter(s->s.startsWith("0")).findAny();

        String[] staraay =fruitsList.toArray(String[]::new);
        System.out.println(upperlist);



    }






}
