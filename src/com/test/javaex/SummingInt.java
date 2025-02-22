package com.test.javaex;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SummingInt {
    public static void main(String[] args) {
        int i =1234567;

        Integer sumofdigits = Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));


        System.out.println(sumofdigits);
    }

}
