package com.test.dtst;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumberTest {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(10,2,7,1,42,56,9,5,24);
        integerList.stream().filter(n -> n%2 ==0).collect(Collectors.toList()).forEach(System.out::println);



    }
}
