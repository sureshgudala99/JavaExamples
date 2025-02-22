package com.test.javaex;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DecimalSorting {

    public static void main(String[] args) {

        List<Double> doubleList = Arrays.asList(10.2,12.8,13.2,14.8,15.2,2.9,10.1,13.8);

        doubleList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

    }

}
