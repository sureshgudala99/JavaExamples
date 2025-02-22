package com.test.today;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class JExSorted {

    public static void main(String[] args) {

        List<String> fruitsList = Arrays.asList("apple","banana","orange");

        fruitsList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(System.out::println);

    }
}
