package com.test.dtst;

import java.util.Arrays;
import java.util.List;

public class StartingWithDigit {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(10,24,35,11,15,54,62,19,13);
        integerList.stream().map(s ->s +"").filter(s ->s.startsWith("1")).forEach(System.out::println);


    }
}
