package com.test.today;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(2,4,7,8,9,12,5,6,2,9,8);

        integerList.stream().skip(3).distinct().collect(Collectors.toList()).forEach(System.out::println);

    //    integerList.stream().skip(3).collect(Collectors.toSet()).forEach(System.out::println);



    }
}
